/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jordan
 */

public class Pc 
{
    private Set<Pokemon> box;
    
    public Pc()
    {
        box = new TreeSet<>();
    }
    
    public void add(Pokemon p)
    {
        box.add(p);
    }
    
    @Override
    public String toString()
    {
        return "" + box;
    }

    public Pokemon get(String name)
    {
        Pokemon p;
        Iterator<Pokemon> i = box.iterator();
        while(i.hasNext())
        {
            p = i.next();
            if(p.getName().equalsIgnoreCase(name))
            {
                i.remove();
                return p;
            }
        }

        return null;
    }
    
}
