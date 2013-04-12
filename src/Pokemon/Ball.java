package Pokemon;

/**
 *
 * @author Jordan
 */
public class Ball extends Item
{
    private final double CATCH_RATE_MULTIPLIER;
    
    public Ball(String n, double m, int p)
    {
        super(n, p);

        CATCH_RATE_MULTIPLIER = m;
    }
    
    public double getMultiplier()
    {
        return CATCH_RATE_MULTIPLIER;
    }
}
