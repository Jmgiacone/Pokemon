package Pokemon.Tests;

import Pokemon.Gender;
import Pokemon.Species;
import Pokemon.Type;
import org.junit.*;

import static org.junit.Assert.*;

public class GenderRatioTest
{
    @Test
    public void getGender() throws Exception
    {
        Gender g = Species.GenderRatio.ONE_FEMALE_SEVEN_MALE.getGender();
        g.name();
    }
}
