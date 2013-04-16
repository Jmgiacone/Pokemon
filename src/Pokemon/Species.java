package Pokemon;

import java.util.Arrays;
import java.util.Random;

public enum Species
{
    NOLAN("Nolan", "000", (byte)1, new short[] {127,127,127,127,127,127}, Type.DARK);


    private final short[] BASE_STATS;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private final byte CATCH_RATE;

    Species(String name, final String dexNumber, final byte catchRate, short[] stats, final Type... type)
    {
        if(type.length > 2)
        {
            throw new IllegalArgumentException("You must input 1 or 2 types for " + name + ". The types " +
                    Arrays.toString(type) + " are invalid.");
        }
        else if(type.length == 0)
        {
            throw new IllegalArgumentException("You must input at least one type for " + name);
        }

        BASE_STATS = new short[] {stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]};
        CATCH_RATE = catchRate;//Dependent on the Pokemon
        NAT_DEX_NUMBER = dexNumber;

        NAME = name;
        TYPE = type;
    }

    /**
     * Retrieves the base value for the desired stat
     * @param stat The stat constant of the stat to get
     * @return The base value of that stat
     * @throws ArrayIndexOutOfBoundsException If the passed in constant is invalid
     */
    public short getBaseStat(final int stat) throws ArrayIndexOutOfBoundsException
    {
        return BASE_STATS[stat];
    }





    /**
     * Returns Name of the Pokemon
     *
     * @return Name of the Pokemon
     */
    public String getName()
    {
        return NAME;
    }

    //Very proud of this method here
    /**
     * This does the damage calculation from the actual Pokemon game and
     * returns the final damage. Props to the equation from
     * http://www.math.miami.edu/~jam/azure/compendium/battdam.htm
     *
     * @param m Move being used
     * @param p Pokemon attacking
     * @return Final damage
     */
    private int damageFormula(Move m, Pokemon p)
    {
        /*
        //Fix up this method to make it more visually appealing
        int a = p.getLevel(), b = p.getInBattleStat(ATTACK), c = m.power(),
                d = inBattleStats[DEFENSE], x = 1, z = new Random().nextInt(38) + 217,
                y = superEffective(m), value;


        if(m.getType().equalsIgnoreCase("PSN"))
        {
            status[POISONED] = true;
        }
        if(m.getName().equalsIgnoreCase("Dragon Rage"))
        {
            return 40;
        }

        value = 2 * a;
        value /= 5;
        if (value < 1.0)
        {
            value = 1;
        }
        value += 2;
        value *= b;
        value *= c;
        value /= d;
         if (value < 1.0)
        {
            value = 1;
        }
        value /= 50;
        if (value < 1.0)
        {
            value = 1;
        }
        value += 2;
        value *= x;
        value *= y;
        value /= 10;
        if (value < 1.0)
        {
            value = 1;
        }
        value *= z;
        value /= 255;
        if (value < 1.0)
        {
            value = 1;
        }
        if(value == 0)
        {
            value = 1;
        }
        //orignal eq'n((((((((2 * a / 5) + 2) * b * c)
        /// d) / 50) + 2) * 1) * y / 10) * z / 255;
        return value;*/

        return 0; //Shut up the compiler
    }

    /**
     * Gets the first type of the Pokemon
     * @return Their first type
     */
    public Type getTypeOne()
    {
        return TYPE[0];
    }

    public Type getTypeTwo()
    {
        return TYPE.length == 2 ? TYPE[1] : getTypeOne();
    }
}
