package Pokemon;

public class Pokemon
{
    public static final byte
            HP = 0,
            ATTACK = 1,
            DEFENSE = 2,
            SP_ATTACK = 3,
            SP_DEFENSE = 4,
            SPEED = 5,
            POISONED = 0,
            PARALYZED = 1,
            BURNED = 2,
            FROZEN = 3,
            ASLEEP = 4,
            SEEDED = 5;
    
    private Species species;
    private final byte[] IVS;
    //Poison, Paralyze, Burn, Frozen, Asleep, Seeded
    private boolean[] status;

    //Byte -128 -> 127
    private byte level;
    private int totalExpForNextLevel, totalExp;

    //HP, Attack, Defense, Sp. Attack, Sp. Defense, Speed
    private short[] currentStats, inBattleStats;
    private byte[] evs;
    private Move[] moveSet;

    public Pokemon(Species species)
    {
        //Set the Species of the Pokemon (ie. Charizard, Squirtle, etc...)
        this.species = species;
        
        //All Pokemon start out with no status conditions
        status = new boolean[] {false, false, false, false, false, false};
        
        //Needs to be a short because get bigger than 128
        inBattleStats = new short[6];
        moveSet = new Move[4];
        
        //IV's only go 0-31;
        IVS = new byte[6];

        for(int i = 0; i < IVS.length; i++)
        {
            IVS[i] = (byte)(Math.random() * 32);
        }

        //EVS all start at 0
        evs = new byte[] {0, 0, 0, 0, 0, 0};

        currentStats = new short[]{
                calculateStat(HP),
                calculateStat(ATTACK),
                calculateStat(DEFENSE),
                calculateStat(SP_ATTACK),
                calculateStat(SP_DEFENSE),
                calculateStat(SPEED)};

        //Copy the contents of currentStats -> inBattleStats
        System.arraycopy(currentStats, 0, inBattleStats, 0, currentStats.length);

        //All Pokemon start at level 5
        level = 5;

        //Exp for next level = (4 * (level + 1)^3) / 5
        totalExpForNextLevel = (4 * (int)Math.pow(level + 1, 3)) / 5;

        //Total XP = (4 * level^3) / 5
        totalExp = (4 * (int)Math.pow(level, 3)) / 5;
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

    /**
     * Calculates any stat
     * @param  stat The Constant for the stat that you want to calculate
     * @return the calculated stat
     */
    private short calculateStat(final byte stat)
    {
        return (short)(stat == HP ? (((IVS[HP] + (2 * species.getBaseStat(HP)) + (evs[HP] / 4) + 100) * level) / 100) + 10 :
                (((IVS[stat] + (2 * species.getBaseStat(stat)) + (evs[stat] / 4)) * level) / 100) + 5);
    }

    public short getInBattleStat(final int stat) throws ArrayIndexOutOfBoundsException
    {
        return inBattleStats[stat];
    }

    public short getCurrentStat(final int stat) throws ArrayIndexOutOfBoundsException
    {
        return currentStats[stat];
    }

    /**
     * All this does is make sure that at the beginning of each battle, all stats except HP have been reset to their original values
     */
    public void resetStats()
    {
        //Ignore the HP
        for(int i = ATTACK; i <= SPEED; i++)
        {
            inBattleStats[i] = currentStats[i];
        }
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

    public void revive()
    {
        for(Move m : moveSet)
        {
            m.resetPP();
            m.resetAccuracy();
        }

        resetStats();
        //Un-neglect the HP
        inBattleStats[HP] = currentStats[HP];

        for(int i = POISONED; i <= SEEDED; i++)
        {
            status[i] = false;
        }
    }
}