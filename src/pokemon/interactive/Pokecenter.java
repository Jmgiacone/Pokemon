package pokemon.interactive;

import pokemon.core.Pokemon;

/**
 * Created with IntelliJ IDEA.
 * User: Nolan
 * Date: 5/20/13
 * Time: 10:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class Pokecenter {
    private Pokecenter() {}

    public static void healParty(final Player p) {
        for(Pokemon pokemon : p.getParty()) {
            if(pokemon != null)
                pokemon.revive();
        }
    }
}
