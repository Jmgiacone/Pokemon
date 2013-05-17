package pokemon.engine;

import pokemon.core.*;
import pokemon.interactive.Player;

public class Battle
{
    private Player p;
    private Pokemon wild;
    private boolean battling;

    public Battle(Player p, Pokemon wild)
    {
        this.p = p;
        this.wild = wild;
        battling = true;
    }

    public/*ivate*/ short calculateDamage(Pokemon attacking, Move used, Pokemon defending)
    {
        //http://bulbapedia.bulbagarden.net/wiki/Damage_modification#Damage_formula
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

        return (short)(((2 * attacking.getLevel() + 10) / 250) * (attack / defense) * used.getPower() + 2 * modifiers(attacking, used, defending));
    }

    public/*rivate*/ short modifiers(Pokemon attacking, Move used, Pokemon defending)
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

        return (short)(stab * typeEffectiveness * crit * ((Math.random() * .15) + .85));
    }

    public boolean isRunning()
    {
        return battling;
    }
}
