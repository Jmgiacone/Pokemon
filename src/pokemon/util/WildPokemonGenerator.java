package pokemon.util;

import pokemon.core.Pokemon;
import pokemon.core.Species;

/**
 * Created with IntelliJ IDEA.
 * User: Nolan
 * Date: 5/14/13
 * Time: 9:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class WildPokemonGenerator {
    //TODO - make enums for each route and what pokemon can appear where along with the level range
    public static Pokemon generatePokemon()
    {
        return new Pokemon(Species.values()[(int) (Math.random() * Species.values().length)]);
    }
}
