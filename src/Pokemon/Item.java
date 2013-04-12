package Pokemon;

public abstract class Item
{
    private final String NAME;
    private final int PRICE;
    
    protected Item(String n, int p)
    {
        NAME = n;
        PRICE = p;
    }
    
    public String getName()
    {
        return NAME;
    }

    public int getPrice()
    {
        return PRICE;
    }
}
