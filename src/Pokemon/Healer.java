package Pokemon;

public class Healer extends Item
{
    private final Stat STAT_AFFECTED;
    private final int POWER;
    
    public Healer(String n, int p, int pw, Stat a)
    {
        super(n, p);
        
        POWER = pw;
        STAT_AFFECTED = a;
    }
    
    public Stat getStatAffected()
    {
        return STAT_AFFECTED;
    }
    
    public int getPower()
    {
        return POWER;
    }
}