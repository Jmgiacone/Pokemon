package pokemon.tests;

import org.junit.Test;
import pokemon.core.Gender;
import pokemon.core.Pokemon;
import pokemon.core.Species;
import pokemon.core.Type;

import static org.junit.Assert.*;

public class PokemonTest
{
    @Test
    public void testGetGender() throws Exception
    {
        Pokemon p = new Pokemon(Species.CHARMANDER);
        Gender g = p.getGender();
        assertEquals(g, p.getGender());
        assertEquals(p.getGender(), g);
    }

    @Test
    public void testGetName() throws Exception
    {
        assertEquals(new Pokemon(Species.PACHIRISU).getName(), "Pachirisu");
    }

    @Test
    public void testGetType() throws Exception
    {
        //assertEquals(new Type[]{Type.WATER}, new Pokemon(Species.MAGIKARP).getType());
    }

    @Test
    public void testGetLevel() throws Exception
    {

    }

    @Test
    public void testGetInBattleStat() throws Exception
    {

    }

    @Test
    public void testGetCurrentStat() throws Exception
    {

    }

    @Test
    public void testGetInBattleHp() throws Exception
    {

    }

    @Test
    public void testAddExp() throws Exception
    {

    }

    @Test
    public void testRevive() throws Exception
    {

    }
}
