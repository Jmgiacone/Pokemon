package pokemon.interactive;

import pokemon.core.Pokemon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Nolan
 * Date: 5/11/13
 * Time: 4:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bag {
    private Map items;

    public Bag() {
        //TODO - add item class, change first key to Item
        items = new HashMap<Integer, Integer>();
    }
}
