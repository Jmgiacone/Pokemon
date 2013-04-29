package pokemon.core;

public enum Move
{
    WHAT("I don't even know", Type.BUG, MoveType.PHYSICAL, 0, 0, 0);
   /*TACKLE("Tackle",Type.NORMAL, 50, 35, 100),
    TAIL_WHIP("Tail Whip",Type.NORMAL, 0, 20, 100, Stat.DEFENSE),
    GROWL("Growl",Type.NORMAL, 0, 40, 100, Stat.ATTACK),
    SCRATCH ("Scratch",Type.NORMAL, 40, 35, 100),
    BUBBLE("Bubble", Type.WATER, 20, 35, 100),
    RAPID_SPIN("Rapid Spin", Type.NORMAL, 20, 40, 100),
    WITHDRAW("Withdraw", Type.WATER, 0, 40, 100, Stat.DEFENSE),
    WATER_GUN("Water Gun", Type.WATER, 40, 35, 100),
    BITE("Bite", Type.DARK, 60, 25, 100),
    EMBER("Ember", Type.FIRE, 40, 25, 100),
    SMOKE_SCREEN("SmokeScreen", Type.NORMAL, 0, 20, 100, Status.ACCURACY),
    DRAGON_RAGE("Dragon Rage", Type.DRAGON, 0, 10, 100),
    SCARY_FACE("Scary Face", Type.NORMAL, 0, 10, 100),
    FIRE_FANG("Fire Fang", Type.FIRE, 65, 15, 95, Status.BURN),
    LEECH_SEED("Leech Seed", Type.GRASS, 0, 10, 90, Stat.HP),
    VINE_WHIP("Vine Whip", Type.GRASS, 35, 15, 100),
    POISONPOWDER("Poison Powder", Type.POISON, 0, 35, 75, Status.POISON),
    TAKE_DOWN("Take Down", Type.NORMAL, 90, 20, 85),
    RAZOR_LEAF("Razor Leaf", Type.GRASS, 55, 25, 95);*/
    
    private String NAME;
    private final Type TYPE;
    private final int POWER, ACCURACY;
    private int pp, battlePP, battleAccuracy;
    private final MoveType MOVE_TYPE;
    private final Status SIDE_EFFECT;
    private final Stat STAT_LOWERED;

    Move(String name, Type type, MoveType m, int power, int pp, int accuracy)
    {
        NAME = name;
        TYPE = type;
        ACCURACY = accuracy;
        MOVE_TYPE = m;
        POWER = power;
        this.pp = pp;
        battlePP = pp;
        SIDE_EFFECT = null;
        STAT_LOWERED = null;
    }

    /*Move(String name, Type type, MoveType m, int power, int pp, int accuracy, Status s)
    {
        NAME = name;
        TYPE = type;
        ACCURACY = accuracy;
        POWER = power;
        this.pp = pp;
        battlePP = pp;
        SIDE_EFFECT = s;
        STAT_LOWERED = null;
    }


    Move(String name, Type type, MoveType m, int power, int pp, int accuracy, Stat s)
    {
        NAME = name;
        TYPE = type;
        ACCURACY = accuracy;
        POWER = power;
        this.pp = pp;
        battlePP = pp;
        SIDE_EFFECT = null;
        STAT_LOWERED = s;
    }


    Move(String name, Type type, MoveType m, int power, int pp, int accuracy, Status status, Stat stat)
    {
        NAME = name;
        TYPE = type;
        ACCURACY = accuracy;
        POWER = power;
        this.pp = pp;
        battlePP = pp;
        ;
        SIDE_EFFECT = status;
        STAT_LOWERED = stat;
    }*/

    public int getPower()
    {
        return POWER;
    }
    
    public void setPP(int PP)
    {
        battlePP = PP;
    }
    
    public void downPP()
    {
        battlePP--;
    }
    
    public int getCurrentPP()
    {
        return battlePP;
    }
    
    public int getTotalPP()
    {
        return pp;
    }
    
    public void addPP(int PP)
    {
        battlePP += PP;
    }

    public void resetAccuracy()
    {
        battleAccuracy = ACCURACY;
    }

    public void resetPP()
    {
        battlePP = pp;
    }
    
    public String getName()
    {
        return NAME;
    }

    public Type getType()
    {
        return TYPE;
    }
    
    public int getAccuracy()
    {
        return ACCURACY;
    }
}