package pokemon.tests;

import org.junit.Test;
import pokemon.core.Move;
import pokemon.core.Pokemon;
import pokemon.core.Species;
import pokemon.engine.Battle;
import pokemon.interactive.Player;

public class BattleTest
{
    @Test
    public void testCalculateDamage() throws Exception
    {
        new Battle(null, null).calculateDamage(new Pokemon(Species.GLACEON, 75), Move.ICE_FANG, new Pokemon(Species.GARCHOMP, 75));
        new Battle(null, null).calculateDamage(new Pokemon(Species.GARCHOMP, 78), Move.EARTHQUAKE, new Pokemon(Species.GLACEON, 75));
    }

    @Test
    public void testModifiers() throws Exception
    {

    }

    @Test
    public void testIsRunning() throws Exception
    {

    }
}
