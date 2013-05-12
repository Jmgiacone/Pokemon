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
    private Bag bag;
    private Pokemon[] party;

    public Player() {
        bag = new Bag();
        party = new Pokemon[6];
    }

    public Bag getBag() {
        return bag;
    }

    public Pokemon[] getParty() {
        return party;
    }

    public boolean swapSlots(final int one, final int two) {
        if((one < 0 || one > 5) || (two < 0 || two > 5)) {
            return false;
        }
        final Pokemon temp = getParty()[one];
        party[one] = party[two];
        party[two] = temp;
        return true;
    }
}
