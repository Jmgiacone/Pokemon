package pokemon.core;

public class Pokemon
{
    private String nickname;
    private Species species;
    private final Nature NATURE;
    private final Gender GENDER;
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

    /**
     * Creates a new Pokemon with a nickname.
     * @param nickname The nickname of the Pokemon.
     * @param s The Pokemon Species that this Pokemon will be based off of.
     */
    public Pokemon(String nickname, Species s)
    {
        this(s);
        this.nickname = nickname;
    }
    /**
     * Creates a brand new Pokemon based on a given species. This Pokemon will start at level 5. If you want to evolve a Pokemon, use the copy constructor.
     * @param species The Pokemon Species that this Pokemon will be based off of.
     */
    public Pokemon(Species species)
    {
        //Set the Species of the Pokemon (ie. Charizard, Squirtle, etc...)
        this.species = species;
        GENDER = species.getGender();
        //All Pokemon start out with no status conditions
        status = new boolean[] {false, false, false, false, false, false};

        nickname = species.getName();
        //Needs to be a short because it can get bigger than 128
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
                calculateStat(Stat.HP),
                calculateStat(Stat.ATTACK),
                calculateStat(Stat.DEFENSE),
                calculateStat(Stat.SP_ATTACK),
                calculateStat(Stat.SP_DEFENSE),
                calculateStat(Stat.SPEED)};

        //Copy the contents of currentStats -> inBattleStats
        System.arraycopy(currentStats, 0, inBattleStats, 0, currentStats.length);

        //All Pokemon start at level 1
        level = 5;

        totalExpForNextLevel = species.calculateExp((byte)(level + 1));

        totalExp = species.calculateExp((byte)(level + 1));

        NATURE = Nature.values()[(int)Math.random() * Nature.values().length];
    }

    public Pokemon(Species evolveTo, Pokemon p)
    {
        species = evolveTo;

        level = p.level;
        NATURE = p.NATURE;
        GENDER = p.GENDER;

        status = new boolean[] {p.status[0], p.status[1], p.status[2], p.status[3], p.status[4], p.status[5]};

        IVS = new byte[] {p.IVS[0], p.IVS[1], p.IVS[2], p.IVS[3], p.IVS[4], p.IVS[5]};
        evs = new byte[] {p.evs[0], p.evs[1], p.evs[2], p.evs[3], p.evs[4], p.evs[5]};

        currentStats = new short[]{
                calculateStat(Stat.HP),
                calculateStat(Stat.ATTACK),
                calculateStat(Stat.DEFENSE),
                calculateStat(Stat.SP_ATTACK),
                calculateStat(Stat.SP_DEFENSE),
                calculateStat(Stat.SPEED)};

        System.arraycopy(currentStats, 0, inBattleStats, 0, currentStats.length);

        totalExpForNextLevel = species.calculateExp((byte)(level + 1));
        totalExp = p.totalExp;
    }

    public Gender getGender()
    {
        return GENDER;
    }

    public String getName()
    {
        return species.getName();
    }

    public Type[] getType()
    {
        return species.getType();
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
    private short calculateStat(final Stat stat)
    {
        return (short)(stat == Stat.HP ? (((IVS[Stat.HP.byteOrdinal()] + (2 * species.getBaseStat(Stat.HP.byteOrdinal())) + (evs[Stat.HP.byteOrdinal()] / 4) + 100) * level) / 100) + 10 :
                (((IVS[stat.byteOrdinal()] + (2 * species.getBaseStat(stat.byteOrdinal())) + (evs[stat.byteOrdinal()] / 4)) * level) / 100) + 5);
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
        for(int i = Stat.ATTACK.ordinal(); i <= Stat.SPEED.ordinal(); i++)
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
        return inBattleStats[Stat.HP.byteOrdinal()];
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
        inBattleStats[Stat.HP.byteOrdinal()] = currentStats[Stat.HP.byteOrdinal()];

        for(int i = Status.POISON.byteOrdinal(); i <= Status.SEED.byteOrdinal(); i++)
        {
            status[i] = false;
        }
    }
}