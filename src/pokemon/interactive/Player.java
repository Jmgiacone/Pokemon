package pokemon.interactive;

import pokemon.core.Pokemon;

/**
 * Created with IntelliJ IDEA.
 * User: Nolan
 * Date: 5/11/13
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private Bag playerBag;

    public Player() {
        playerBag = new Bag();
    }

    public Bag getBag() {
        return playerBag;
    }
}
