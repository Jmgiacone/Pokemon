package pokemon.tests;

import org.junit.Test;
import pokemon.core.Gender;
import pokemon.core.Pokemon;
import pokemon.core.Species;

public class GenderRatioTest
{
    @Test
    public void getGender() throws Exception
    {
        Gender g = new Pokemon(Species.BULBASAUR).getGender();
        g.name();
    }
}
