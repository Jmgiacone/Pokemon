package pokemon.util;

import pokemon.core.Move;
import pokemon.core.Pokemon;
import pokemon.core.Status;

/**
 * Created with IntelliJ IDEA.
 * User: Nolan
 * Date: 5/21/13
 * Time: 3:36 PM
 */
public class Effect {
    private static final Status[] effects = Status.values();

    public static boolean applyStatus(final Move m, final Pokemon p) {
        final Status s = m.getStatusEffect();
        for(int i = 0; i < p.getStatus().length; i++) {
            if(s.ordinal() == i) {
                p.getStatus()[i] = true;
                return true;
            }
        }
        return false;
    }
}
