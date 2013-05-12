package pokemon.interactive;

import pokemon.core.Pokemon;

import java.util.Arrays;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Nolan
 * Date: 5/11/13
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private int money;
    private String name;
    private Bag bag;
    private Pokemon[] party;

    public Player(final String name) {
        this.money = 0;
        this.name = name;
        this.bag = new Bag();
        this.party = new Pokemon[6];
    }

    public int getMoney() {
        return this.money;
    }

    public String getName() {
        return this.name;
    }

    public Bag getBag() {
        return this.bag;
    }

    public Pokemon[] getParty() {
        return this.party;
    }

    /**
     * Attempts to add a <code>Pokemon</code> to your party.
     * @param pokemon <code>Pokemon</code> to add to the party.
     * @return <code>true</code> if the pokemon was added, <code>false</code> otherwise.
     */
    public boolean addToParty(final Pokemon pokemon) {
        for(Pokemon p : getParty()) {
            if(p == null) {
                p = pokemon;
                return true;
            }
        }
        return false;
    }

    public boolean swapSlots(final int one, final int two) {
        if((one < 0 || one > 5) || (two < 0 || two > 5)) {
            return false;
        }
        final Pokemon temp = getParty()[one];
        this.party[one] = this.party[two];
        this.party[two] = temp;
        return true;
    }

    public String toString() {
        return "Name: " + getName() +
               "Money: " + getMoney() +
               "\nBag contents " + getBag().getMap() +
               "\nParty contents " + Arrays.toString(getParty());
    }
}
