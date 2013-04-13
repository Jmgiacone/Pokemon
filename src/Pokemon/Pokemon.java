package Pokemon;

import java.util.Arrays;
import java.util.Random;
 
public enum Pokemon
{

    BULBASAUR("Bulbasaur", 1, 45, new int[]{49,49,65,65,45,45}, false, Type.GRASS, Type.POISON),
    IVYSAUR("IVYSAUR", 2, 45,  new int[]{62,63,80,80,60,60}, false, Type.GRASS, Type.POISON),
    VENASAUR("Venasaur", 3, 45, new int[]{82,83,100,100,80,80}, false, Type.GRASS, Type.POISON),
    CHARMANDER("Charmander", 4, 45, new int[]{52,43,60,50,65,39}, false, Type.FIRE),
    CHARMELEON("Charmeleon", 5, 45, new int[]{64,58,80,65,80,58}, false, Type.FIRE),
    CHARIZARD("Charizard", 6, 45, new int[]{84,78,109,85,100,78}, false, Type.FIRE, Type.FLYING),
    SQUIRTLE("Squirtle", 7, 45, new int[]{48,65,50,64,43,44}, false, Type.WATER),
    WARTORTLE("Wartortle", 8, 45, new int[]{63,80,65,80,58,59}, false, Type.WATER),
    BLASTOISE("Blastoise", 9, 45, new int[]{83,100,85,105,78,79}, false, Type.WATER),
    CATERPIE("Caterpie", 10, 255, new int[]{30,35,20,20,45,45}, false, Type.BUG),
    METAPOD("Metapod", 11, 120, new int[]{20,55,25,25,30,50}, false, Type.BUG),
    BUTTERFREE("Butterfree", 12, 45, new int[]{45,50,80,80,70,60}, false, Type.BUG, Type.FLYING),
    WEEDLE("Weedle", 13, 255, new int[]{35,30,20,20,50,40}, false, Type.BUG, Type.POISON),
    KAKUNA("Kakuna", 14, 120, new int[]{25,50,25,25,35,45}, false, Type.BUG, Type.POISON),
    BEEDRILL("Beedrill", 15, 45, new int[]{80,40,45,80,75,65}, false, Type.BUG, Type.POISON),
    PIDGEY("Pidgey", 16, 255, new int[]{45,40,35,35,56,40}, false, Type.NORMAL, Type.FLYING),
    PIDGEOTTO("Pidgeotto", 17, 120, new int[]{60,55,50,50,71,63}, false, Type.NORMAL, Type.FLYING),
    PIDGEOT("Pidgeot", 18, 45, new int[]{80,75,70,70,91,83}, false, Type.NORMAL, Type.FLYING),
    RATTATA("Rattata", 19, 255, new int[]{56,35,25,35,72,30}, false, Type.NORMAL),
    RATICATE("Raticate", 20, 127, new int[]{81,60,50,70,97,55}, false, Type.NORMAL),
    SPEAROW("Spearow", 21, 255, new int[]{60,30,31,31,70,40}, false, Type.NORMAL, Type.FLYING),
    FEAROW("Fearow", 22, 90, new int[]{90,65,61,61,100,65}, false, Type.NORMAL, Type.FLYING),
    EKANS("Ekans", 23, 255, new int[]{60,44,40,54,55,35}, false, Type.POISON),
    ARBOK("Arbok", 24, 90, new int[]{85,69,65,79,80,60}, false, Type.POISON),
    PIKACHU("Pikachu", 25, 190, new int[]{55,30,50,40,90,60}, false, Type.ELECTRIC),
    RAICHU("Raichu", 26, 75, new int[]{90,55,90,80,100,60}, false, Type.ELECTRIC),
    SANDSHREW("Sandshrew", 27, 255, new int[]{75,85,20,30,40,50}, false, Type.GROUND),
    SANDSLASH("Sandslash", 28, 90, new int[]{100,110,45,55,65,75}, false, Type.GROUND),
    NIDORAN_FEMALE("Nidoran" + '\u2640', 29, 235, new int[]{47,52,40,40,41,55}, false, Type.POISON),
    NIDORINA("Nidorina", 30, 120, new int[]{62,67,55,55,56,70}, false, Type.POISON),
    NIDOQUEEN("Nidoqueen", 31, 45, new int[]{82,87,75,85,76,90}, false, Type.POISON, Type.GROUND),
    NIDORAN_MALE("Nidoran" + '\u2642', 32, 235, new int[]{57,40,40,40,50,46}, false, Type.POISON),
    NIDORINO("Nidorino", 33, 120, new int[]{72,57,55,55,65,61}, false, Type.POISON),
    NIDOKING("Nidoking", 34, 45, new int[]{92,77,85,75,85,81}, false, Type.POISON, Type.GROUND),
    CLEFAIRY("Clefairy", 35, 150, new int[]{45,48,60,65,35,70}, false, Type.NORMAL),
    CLEFABLE("Clefable", 36, 25, new int[]{70,73,85,90,60,95}, false, Type.NORMAL),
    VULPIX("Vulpix", 37, 190, new int[]{41,40,50,65,65,38}, false, Type.FIRE),
    NINETAILS("Ninetails", 38, 75, new int[]{76,75,81,100,100,73}, false, Type.FIRE),
    JIGGLYPUFF("Jigglypuff", 39, 170, new int[]{45,20,45,25,20,115}, false, Type.NORMAL),
    WIGGLYTUFF("Wigglytuff", 40, 50, new int[]{70,45,75,50,45,140}, false, Type.NORMAL),
    ZUBAT("Zubat", 41, 255, new int[]{45,35,30,40,55,40}, false, Type.POISON, Type.FLYING),
    GOLBAT("Golbat", 42, 90, new int[]{80,70,65,75,90,75}, false, Type.POISON, Type.FLYING),
    ODDISH("Oddish", 43, 255, new int[]{50,55,75,65,30,45}, false, Type.GRASS, Type.POISON),
    GLOOM("Gloom", 44, 120, new int[]{65,70,85,75,40,60}, false, Type.GRASS, Type.POISON),
    VILEPLUME("Vileplume", 45, 45, new int[]{80,85,100,90,50,75}, false, Type.GRASS, Type.POISON),
    PARAS("Paras", 46, 190, new int[]{70,55,45,55,25,35}, false, Type.BUG, Type.POISON),
    PARASECT("Parasect", 47, 75, new int[]{95,80,60,80,30,60}, false, Type.BUG, Type.POISON),
    VENONAT("Venonat", 48, 190, new int[]{55,50,40,55,45,60}, false, Type.BUG, Type.POISON),
    VENOMOTH("Venomoth", 49, 75, new int[]{65,60,90,75,90,70}, false, Type.BUG, Type.POISON),
    DIGLETT("Diglett", 50, 255, new int[]{55,25,35,45,95,10}, false, Type.GROUND),
    DUGTRIO("Dugtrio", 51, 50, new int[]{80,50,50,70,120,35}, false, Type.GROUND),
    MEOWTH("Meowth", 52, 255, new int[]{45,35,40,40,90,40}, false, Type.NORMAL);


    private final int[] BASE_STATS;
    private final Type[] TYPE;
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
            SEEDED = 5;
    private final int CATCH_RATE, NAT_DEX_NUMBER;
    private final boolean WILD;
    //Poison, Paralyze, Burn, Frozen, Asleep, Seeded
    private boolean[] status;
    //Shorts -128 -> 127
    private short level;
    private int totalExpForNextLevel, totalExp;
    //Attack, Defense, Sp. Attack, Sp. Defense, Speed, HP
    private int[] currentStats, inBattleStats, ivs, evs;
    private Move[] moveSet;
    
    Pokemon(String name, final int dexNumber, final int catchRate, int[] stats, boolean wild, final Type... type)
    {
        if(type.length > 2)
        {
            throw new IllegalArgumentException("You must input 1 or 2 types for " + name + ". The types " +
                    Arrays.toString(type) + " are invalid.");
        }
        else if(type.length == 0)
        {
            throw new IllegalArgumentException("You must input at least one type for " + name);
        }
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
        currentStats = new int[]{
        calculateStat(ATTACK),
        calculateStat(DEFENSE),
        calculateStat(SP_ATTACK),
        calculateStat(SP_DEFENSE),
        calculateStat(SPEED),
        calculateStat(HP)};        
        
        System.arraycopy(currentStats, 0, inBattleStats, 0, currentStats.length);
        CATCH_RATE = catchRate;//Dependent on the Pokemon
        NAT_DEX_NUMBER = dexNumber;
        ivs = new int[6];
        level = 5;
        totalExpForNextLevel = (4 * (int)Math.pow(level + 1, 3)) / 5;
        
        totalExp = (4 * (int)Math.pow(level, 3)) / 5;
        
        NAME = name;
        TYPE = type;
        WILD = wild;
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
    
    public int getInBattleStat(final int stat) throws ArrayIndexOutOfBoundsException
    {
        return inBattleStats[stat];
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
        int a = p.getLevel(), b = p.getInBattleStat(ATTACK), c = m.power(),
                d = inBattleStats[DEFENSE], x = 1, z = new Random().nextInt(38) + 217,
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
        System.arraycopy(currentStats, 0, inBattleStats, 0, BASE_STATS.length);
    }
    
    /**
     * This returns current HP
     * 
     * @return current health
     */
    public int getInBattleHp()
    {
        return inBattleStats[HP];
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
    public Type getTypeOne()
    {
        return TYPE[0];
    }

    public Type getTypeTwo()
    {
        return TYPE.length == 2 ? TYPE[1] : getTypeOne();
    }
    public void revive()
    {
        for(Move m : moveSet)
        {
            m.resetPP();
            m.resetAccuracy();
        }

        resetStats();

        for(int i = POISONED; i <= SEEDED; i++)
        {
            status[i] = false;
        }
    }
    
}