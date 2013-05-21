package pokemon.engine;

import pokemon.core.*;
import pokemon.interactive.Player;

public class Battle
{
    private Player p;
    private Pokemon opponent, player;
    private byte pokemonSlot;
    private boolean running;

    public Battle(Player p, Pokemon opponent)
    {
        this.p = p;
        this.opponent = opponent;
        this.running = true;
        pokemonSlot = 0;
        player = p.getParty()[pokemonSlot];
    }

    private boolean containsMove(Move[] moves, Move m)
    {
        for(Move move : moves)
        {
            if(move == m)
            {
                return true;
            }
        }

        return false;
    }

    public String useMove(final Move m)
    {
        if(!containsMove(player.getMoveSet(), m))
        {
            return player.getName() + " does not know how to use " + m.getName() + ".";
        }

        String str = "";
        //TODO Make the randomization prioritize Supereffective moves
         Move opponentMove = opponent.getMoveSet()[(byte)(Math.random() * opponent.getMoveSet().length)];

        //short playerDamage = calculateDamage(player, m, opponent), opponentDamage = calculateDamage(opponent, opponentMove, player);
        if(player.getInBattleStat(Stat.SPEED) >= opponent.getInBattleStat(Stat.SPEED))
        {
            //Player is faster OR the speeds are equal

            return str + useMoveInOrder(player, m, opponent, opponentMove);
        }
        else
        {
            //Opponent is faster
            return str + useMoveInOrder(opponent, opponentMove, player, m);

        }
    }

    private String useMoveInOrder(Pokemon first, Move firstMove, Pokemon second, Move secondMove)
    {
        String str = first.getName() + " used " + firstMove.getName() + "!";
        short firstDamage = calculateDamage(first, firstMove, second), secondDamage = calculateDamage(second, secondMove, first);

        if((byte)(Math.random() * 100) + 1 <= firstMove.getAccuracy())
        {
            str += "\n" + first.getName() + " deals " + firstDamage + " damage to " + second.getName() + "!";
            second.takeDamage(firstDamage);

            float f = typeEffectiveness(second, firstMove);

            if(f == 0)
            {
                str += "\nIt has no effect on " + second.getName() + ".";
            }
            else if(f < 1)
            {
                str += "\nIt's not very effective";
            }
            else if(f > 1)
            {
                str += "\nIt's Super Effective!";
            }
        }
        else
        {
            str += "\nbut it missed...";
        }

        if(second.isFainted())
        {
            str = str + "\n" + second.getName() + " fainted!";
            if(first.equals(player))
            {
                str += "\n" + first.getName() + " gained " + calcExp(first, second) + " exp!";

                first.addExp(calcExp(first, second));

                str += "\n" + first.levelUp();
            }
            else
            {
                running = false;
                second.revive();
            }

            return str + "\n";
        }

        str += "\n" + second.getName() + " used " + secondMove.getName() + "!";
        if((byte)(Math.random() * 100) + 1 <= secondMove.getAccuracy())
        {
            str += "\n" + second.getName() + " deals " + secondDamage + " damage to " + first.getName() + "!";
            first.takeDamage(secondDamage);

            float f = typeEffectiveness(first, secondMove);

            if(f == 0)
            {
                str += "\nIt has no effect on " + first.getName() + ".";
            }
            else if(f < 1)
            {
                str += "\nIt's not very effective";
            }
            else if(f > 1)
            {
                str += "\nIt's Super Effective!";
            }
        }
        else
        {
            str += "\nbut it missed...";
        }

        if(first.isFainted())
        {
            str = str + "\n" + first.getName() + " fainted!";
            if(second.equals(player))
            {
                str += "\n\n" + second.getName() + " gained " + calcExp(second, first) + " exp!";
                second.addExp(calcExp(second, first));

                str += "\n" + second.levelUp();
            }
            else
            {
                running  = false;
                first.revive();
            }

            return str + "\n";
        }

        return str + "\n";
    }
    private int calcExp(Pokemon victor, Pokemon loser)
    {
        return (int)(((loser.getExpYield() * loser.getLevel()) / 5.0) *
                ((Math.pow(2 * loser.getLevel() + 10, 2.5) / Math.pow(loser.getLevel() + victor.getLevel() + 10, 2.5)) + 1));
    }
    private short calculateDamage(Pokemon attacking, Move used, Pokemon defending)
    {
        //http://bulbapedia.bulbagarden.net/wiki/Damage_modification#Damage_formula
        //http://www.smogon.com/bw/articles/bw_complete_damage_formula
        short attack, defense;
        switch(used.getMoveType())
        {
            case PHYSICAL:
                attack = attacking.getInBattleStat(Stat.ATTACK);
                defense = defending.getInBattleStat(Stat.DEFENSE);
                break;
            case SPECIAL:
                attack = attacking.getInBattleStat(Stat.SP_ATTACK);
                defense = defending.getInBattleStat(Stat.SP_DEFENSE);
                break;
            case STATUS:
                return 0;
            default:
                throw new IllegalStateException("The MoveType " + used.getMoveType() + " is illegal");
        }

        return (short)((((2 * attacking.getLevel() + 10) / 250.0) *
                (attack / (double)defense) * used.getPower() + 2) * modifiers(attacking, used, defending));
    }

    private float typeEffectiveness(Pokemon defending, Move used)
    {
        float typeEffectiveness = 1;

        for(Type t : defending.getType())
        {
            if(used.getType().isSuperEffectiveAgainst(t))
            {
                typeEffectiveness *= 2;
            }
            else if(used.getType().isNotVeryEffectiveAgainst(t))
            {
                typeEffectiveness *= .5;
            }
            else if(used.getType().hasNoEffectOn(t))
            {
                typeEffectiveness *= 0;
            }
        }

        return typeEffectiveness;
    }
    /**
     * Finds the correct damage modifier for the move used based on the attacking and defending <code>Pokemon</code>'s characteristics.
     * @param attacking
     * @param used
     * @param defending
     * @return
     */
    private float modifiers(Pokemon attacking, Move used, Pokemon defending)
    {
        //http://bulbapedia.bulbagarden.net/wiki/Damage_modification#Damage_formula
        float stab = 1;
        byte crit = (byte)(Math.random() * 10000 < 625 ? 2 : 1);

        for(Type t : attacking.getType())
        {
            if(t == used.getType())
            {
                stab = (float)1.5;
            }
        }

        return (float)(stab * typeEffectiveness(defending, used) * crit * ((byte)((Math.random() * 16) + 85) / 100.0));
    }

    /**
     * Sets the running state of a battle.
     * @param running <code>true</code> if you want to battle to be in a running state, <code>false</code> otherwise.
     */
    public void setRunning(final boolean running) {
        this.running = running;
    }

    /**
     * Checks to see whether or not a Battle is still running.
     * @return <code>true</code> if its running, <code>false</code> otherwise.
     */
    public boolean isRunning() {
        return running && (!(opponent.getInBattleHp() <= 0) && !(p.getParty()[0].getInBattleHp() <= 0));
    }

    @Override
    public String toString()
    {
        return player + "\n" + opponent;
    }
}
