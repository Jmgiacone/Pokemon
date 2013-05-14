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
    public static Pokemon generatePokemon() {
        int rand = (int) (Math.random() * Species.values().length);
        for(final Species s : Species.values()) {
            if(Integer.parseInt(s.getDexNumber()) == rand) {
                return new Pokemon(s);
            }
        }
        return null;
    }
}
