package pokemon.interactive;

import pokemon.core.Pokemon;

/**
 * Created with IntelliJ IDEA.
 * User: Nolan
 * Date: 5/11/13
 * Time: 4:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bag {
    private Pokemon[] pokemonSlots;

    public Bag() {
        pokemonSlots = new Pokemon[6];
    }

    public Pokemon[] getPokemonSlots() {
        return pokemonSlots;
    }
}
