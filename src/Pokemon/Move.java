package Pokemon;

public class Move
{
    public static final Move 
            TACKLE = new Move("Tackle","Normal", 50, 35, 100),
            TAIL_WHIP = new Move("Tail Whip","Normal", 0, 20, 100, Stat.DEFENSE),
            GROWL = new Move("Growl","Normal", 0, 40, 100, Stat.ATTACK),
            SCRATCH = new Move ("Scratch","Normal", 40, 35, 100),
            BUBBLE = new Move("Bubble", "Water", 20, 35, 100),
            RAPID_SPIN = new Move("Rapid Spin", "Normal", 20, 40, 100),
            WITHDRAW = new Move("Withdraw", "Water", 0, 40, 100, Stat.DEFENSE),
            WATER_GUN = new Move("Water Gun", "Water", 40, 35, 100),
            BITE = new Move("Bite", "Dark", 60, 25, 100),
            EMBER = new Move("Ember", "Fire", 40, 25, 100),
            SMOKE_SCREEN = new Move("SmokeScreen", "Normal", 0, 20, 100, Status.ACCURACY),
            DRAGON_RAGE = new Move("Dragon Rage", "Dragon", 0, 10, 100),
            SCARY_FACE = new Move("Scary Face", "Normal", 0, 10, 100),
            FIRE_FANG = new Move("Fire Fang", "Fire", 65, 15, 95, Status.BURN),
            LEECH_SEED = new Move("Leech Seed", "Grass", 0, 10, 90, Stat.HP),
            VINE_WHIP = new Move("Vine Whip", "Grass", 35, 15, 100),
            POISONPOWDER = new Move("Poison Powder", "PSN", 0, 35, 75, Status.PSN),
            TAKE_DOWN = new Move("Take Down", "Normal", 90, 20, 85),
            RAZOR_LEAF = new Move("Razor Leaf", "Grass", 55, 25, 95);
    
    private String type, name;
    private int power, pp, currentPP, currentPower, accuracy;
    private final Status SIDE_EFFECT;
    private final Stat STAT_LOWERED;

    public Move(String Name, String Type, int Power, int Pp, int Accuracy)
    {
        name = Name;
        type = Type;
        accuracy = Accuracy;
        power = Power;
        pp = Pp;
        currentPP = pp;
        currentPower = power;
        SIDE_EFFECT = null;
        STAT_LOWERED = null;
    }
    public Move(String name, String type, int power, int pp, int accuracy, Status s)
    {
        this.name = name;
        this.type = type;
        this.accuracy = accuracy;
        this.power = power;
        this.pp = pp;
        currentPP = pp;
        currentPower = power;
        SIDE_EFFECT = s;
        STAT_LOWERED = null;
    }

    public Move(String name, String type, int power, int pp, int accuracy, Stat s)
    {
        this.name = name;
        this.type = type;
        this.accuracy = accuracy;
        this.power = power;
        this.pp = pp;
        currentPP = pp;
        currentPower = power;
        SIDE_EFFECT = null;
        STAT_LOWERED = s;
    }

    public Move(String name, String type, int power, int pp, int accuracy, Status status, Stat stat)
    {
        this.name = name;
        this.type = type;
        this.accuracy = accuracy;
        this.power = power;
        this.pp = pp;
        currentPP = pp;
        currentPower = power;
        SIDE_EFFECT = status;
        STAT_LOWERED = stat;
    }
    public int power()
    {
        return power;
    }
    
    public int attackAI(String pName)
    {
        System.out.printf("Wild %s used %s\n", pName, name);
        return power;
    }
    
    public void changePP(int PP)
    {
        currentPP = PP;
    }
    
    public void downPP()
    {
        currentPP--;
    }
    
    public int currentPP()
    {
        return currentPP;
    }
    
    public int totalPP()
    {
        return pp;
    }
    
    public void addPP(int PP)
    {
        currentPP += PP;
    }
    
    public void resetPP()
    {
        currentPP = pp;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public int getAccuracy()
    {
        return accuracy;
    }
    public int getCurrentPower()
    {
        return currentPower;
    }
}