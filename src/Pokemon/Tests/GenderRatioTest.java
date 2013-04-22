package Pokemon.Tests;

import Pokemon.Core.Gender;
import Pokemon.Core.Species;
import org.junit.*;

public class GenderRatioTest
{
    @Test
    public void getGender() throws Exception
    {
        Gender g = Species.GenderRatio.ONE_FEMALE_SEVEN_MALE.getGender();
        g.name();
    }
}
