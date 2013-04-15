package Pokemon.Tests;

import Pokemon.Type;
import org.junit.*;

import static org.junit.Assert.*;

public class TypeTest
{
    @Test
    public void testIsSuperEffectiveAgainst() throws Exception
    {
        assertFalse(Type.POISON.isSuperEffectiveAgainst(Type.STEEL));
        assertTrue(Type.WATER.isSuperEffectiveAgainst(Type.FIRE));
        assertTrue(Type.BUG.isSuperEffectiveAgainst(Type.GRASS));
        assertFalse(Type.FIGHTING.isSuperEffectiveAgainst(Type.GHOST));
        assertTrue(Type.FIGHTING.isSuperEffectiveAgainst(Type.NORMAL));
        assertFalse(Type.NORMAL.isSuperEffectiveAgainst(Type.FIGHTING));
    }

    @Test
    public void testIsNotVeryEffectiveAgainst() throws Exception
    {

    }

    @Test
    public void testHasNoEffectOn() throws Exception
    {

    }

    @Test
    public void testIsNormalAgainst() throws Exception
    {

    }
}
