package Pokemon;

import java.util.Map;
import java.util.TreeMap;

public class Bag
{
    private Map<Item, Integer> bag;
    
    public Bag()
    {
        bag = new TreeMap<>();
    }
    
    public void addToBag(Item i)
    {
        if(!bag.containsKey(i))
        {
            bag.put(i, 1);
            return;
        }
        
        bag.put(i, bag.get(i) + 1);
    }
    
    public boolean isInBag(Item i)
    {
        return bag.containsKey(i);
    }
    
    public int amountInBag(Item i)
    {
        return bag.get(i) == null ? 0 : bag.get(i);
    }
    
    public void removeFromBag(Item i)
    {
        if(bag.get(i) == 1)
        {
            bag.remove(i);
            return;
        }
        
        bag.put(i, bag.get(i) - 1);
    }
}