package pokemon.engine;

import pokemon.core.*;
import pokemon.interactive.Player;

public class Battle
{
    private Player p;
    private Pokemon wild;
    private boolean running;

    public Battle(Player p, Pokemon wild)
    {
        this.p = p;
        this.wild = wild;
        this.running = true;
    }

    public void useMove(final Move m, final boolean player) {
        if(player) {
            wild.setInBattleHp(wild.getInBattleHp() - calculateDamage(p.getParty()[0], m, wild));
        } else {
            p.getParty()[0].setInBattleHp(p.getParty()[0].getInBattleHp() - calculateDamage(wild, m, p.getParty()[0]));
        }
    }

    public short calculateDamage(Pokemon attacking, Move used, Pokemon defending)
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

    /**
     * Finds the correct damage modifier for the move used based on the attacking and defending <code>Pokemon</code>'s characteristics.
     * @param attacking
     * @param used
     * @param defending
     * @return
     */
    public short modifiers(Pokemon attacking, Move used, Pokemon defending)
    {
        //http://bulbapedia.bulbagarden.net/wiki/Damage_modification#Damage_formula
        float stab = 1, typeEffectiveness = 1;
        byte crit = (byte)(Math.random() * 10000 < 625 ? 2 : 1);

        for(Type t : attacking.getType())
        {
            if(t == used.getType())
            {
                stab = (float)1.5;
            }
        }

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

        return (short)(stab * typeEffectiveness * crit * ((byte)((Math.random() * 16) + 85) / 100.0));
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
        return running && (!(wild.getInBattleHp() <= 0) && !(p.getParty()[0].getInBattleHp() <= 0));
    }
}
