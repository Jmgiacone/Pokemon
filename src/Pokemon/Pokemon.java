package Pokemon;

import java.util.Random;
 
public enum Pokemon
{

    BULBASAUR("Bulbasaur", Type.GRASS_POISON, new int[]{1,1,1,1,1,1,1,1}, false);

    private final int[] BASE_STATS;
    private final Type TYPE;
    private final String NAME;
    private final short
            ATTACK = 0, 
            DEFENSE = 1, 
            SP_ATTACK = 2, 
            SP_DEFENSE = 3, 
            SPEED = 4, 
            HP = 5, 
            POISONED = 0, 
            PARALYZED = 1, 
            BURNED = 2, 
            FROZEN = 3, 
            ASLEEP = 4, 
            SEEDED = 5,
            CATCH_RATE;
    private final boolean WILD;
    //Poison, Paralyze, Burn, Frozen, Asleep, Seeded
    private boolean[] status;
    //Shorts -128 -> 127
    private short level;
    private int totalExpForNextLevel, totalExp;
    //Attack, Defense, Sp. Attack, Sp. Defense, Speed, HP
    private int[] calculatedStats, currentStats, ivs, evs;
    private Move[] moveSet;
    
    Pokemon(String name, Type type, int[] stats, boolean wild)
    {
        //No ailments when initialized
        status = new boolean[] {false, false, false, false, false, false};
        BASE_STATS = new int[] {stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]};
        moveSet = new Move[4];
        ivs = new int[6];
        
        for(int i = 0; i < ivs.length; i++)
        {
            ivs[i] = new Random().nextInt(31) + 1;
        }
        
        evs = new int[] {0, 0, 0, 0, 0, 0};
        calculatedStats = new int[]{
        calculateStat(ATTACK),
        calculateStat(DEFENSE),
        calculateStat(SP_ATTACK),
        calculateStat(SP_DEFENSE),
        calculateStat(SPEED),
        calculateStat(HP)};        
        
        System.arraycopy(calculatedStats, 0, currentStats, 0, calculatedStats.length);
        CATCH_RATE = 255;//Dependent on the Pokemon
        ivs = new int[6];
        level = 5;
        totalExpForNextLevel = (4 * (int)Math.pow(level + 1, 3)) / 5;
        
        totalExp = (4 * (int)Math.pow(level, 3)) / 5;
        
        NAME = name;
        TYPE = type;
        WILD = wild;
    }
    
    Pokemon(Pokemon p)
    {
        NAME = p.NAME;
        level = p.level;
        TYPE = p.TYPE;
        
        evs = p.evs;
        ivs = p.ivs;
        BASE_STATS = p.BASE_STATS;
        
        for(int i = ATTACK; i <= HP; i++)
        {
            calculatedStats[i] = calculateStat(i);
        }
        
        CATCH_RATE = p.CATCH_RATE;
        WILD = p.WILD;
        
        totalExp = p.totalExp;
        totalExpForNextLevel = (4 * (int)Math.pow(level + 1, 3)) / 5;
        
        status = p.status;
        moveSet = p.moveSet;
        
    }
    
    /**
     * Retrieves the base value for the desired stat
     * @param stat The stat constant of the stat to get
     * @return The base value of that stat
     * @throws ArrayIndexOutOfBoundsException If the passed in constant is invalid 
     */
    public int getBaseStat(final int stat) throws ArrayIndexOutOfBoundsException
    {
        return BASE_STATS[stat];
    }
    
    public int getCurrentStat(final int stat) throws ArrayIndexOutOfBoundsException
    {
        return currentStats[stat];
    }
    
   /**
     * Calculates any stat
     * @param  stat The Constant for the stat that you want to calculate
     * @return the calculated stat
     */
    private int calculateStat(final int stat)
    {
        return stat == HP ? (((ivs[HP] + (2 * BASE_STATS[HP]) + (evs[HP] / 4) + 100) * level) / 100) + 10 : 
                (((ivs[stat] + (2 * BASE_STATS[stat]) + (evs[stat] / 4)) * level) / 100) + 5;
    }
    
    /**
     * Returns Name of the Pokemon
     * 
     * @return Name of the Pokemon
     */
    public String getName()
    {
        return NAME;
    }
    
    /**
     * Returns the level of the Pokemon
     * 
     * @return level
     */
    public int getLevel()
    {
        return level;
    }
    
    //Very proud of this method here 
    /**
     * This does the damage calculation from the actual Pokemon game and 
     * returns the final damage. Props to the equation from 
     * http://www.math.miami.edu/~jam/azure/compendium/battdam.htm
     * 
     * @param m Move being used
     * @param p Pokemon attacking
     * @return Final damage
     */
    private int damageFormula(Move m, Pokemon p)
    {
        /*
        //Fix up this method to make it more visually appealing
        int a = p.getLevel(), b = p.getCurrentStat(ATTACK), c = m.power(), 
                d = currentStats[DEFENSE], x = 1, z = new Random().nextInt(38) + 217, 
                y = superEffective(m), value;
        

        if(m.getType().equalsIgnoreCase("PSN"))
        {
            status[POISONED] = true;
        }
        if(m.getName().equalsIgnoreCase("Dragon Rage"))
        {
            return 40;
        }
        
        value = 2 * a;
        value /= 5;
        if (value < 1.0)
        {
            value = 1;
        }
        value += 2;
        value *= b;
        value *= c;
        value /= d;
         if (value < 1.0)
        {
            value = 1;
        }
        value /= 50;
        if (value < 1.0)
        {
            value = 1;
        }
        value += 2;
        value *= x;
        value *= y;
        value /= 10;
        if (value < 1.0)
        {
            value = 1;
        }
        value *= z;
        value /= 255;
        if (value < 1.0)
        {
            value = 1;
        }
        if(value == 0)
        {
            value = 1;
        }
        //orignal eq'n((((((((2 * a / 5) + 2) * b * c) 
        /// d) / 50) + 2) * 1) * y / 10) * z / 255;
        return value;*/

        return 0; //Shut up the compiler
    }
    
    /**
     * All this does is make sure that at the beginning of each battle, 
     * the stats have been reset to their original values
     */
    public void resetStats()
    {
        System.arraycopy(calculatedStats, 0, currentStats, 0, BASE_STATS.length);
    }
    
    /**
     * This returns current HP
     * 
     * @return current health
     */
    public int getCurrentHp()
    {
        return currentStats[HP];
    }
    
    /**
     * This is how the Pokemon gains totalExperience
     * 
     * @param newExp the totalExp to be added
     * @return void
     */
    public void addExp(int newExp)
    {
        totalExp += newExp;
    }
    
    /**
     * Gets the first type of the Pokemon
     * @return Their first type
     */
    public Type getType()
    {
        return TYPE;
    }

    public void revive()
    {
        for(int i = 0; i < 4; i++)
        {
            moveSet[i].resetPP();
        }

        resetStats();
        status[POISONED] = false;
        status[PARALYZED] = false;
        status[FROZEN] = false;
        status[ASLEEP] = false;
        status[BURNED] = false;
        status[SEEDED] = false;
    }
    
}