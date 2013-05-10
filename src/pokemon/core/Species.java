package pokemon.core;

import java.util.Arrays;

public enum Species
{
    NOLAN("Nolan", "000", (short)1, new short[] {127,127,127,127,127,127}, (byte)0, new byte[] {1, 1, 1, 1, 1, 1},
            GenderRatio.GENDERLESS, ExperienceGroup.FLUCTUATING, null, null, null, Type.DARK);

    private enum GenderRatio
    {
        MALE_ONLY((byte)100),
        ONE_FEMALE_SEVEN_MALE((float)87.5),
        ONE_FEMALE_THREE_MALE((byte)75),
        ONE_FEMALE_ONE_MALE((byte)50),
        THREE_FEMALE_ONE_MALE((byte)25),
        FEMALE_ONLY((byte)0),
        GENDERLESS((byte)-1);

        private final float PERCENT_MALE;

        GenderRatio(byte percentMale)
        {
            PERCENT_MALE = percentMale;
        }

        GenderRatio(float percentMale)
        {
            PERCENT_MALE = percentMale;
        }

        public Gender getGender()
        {
            switch((byte)PERCENT_MALE)
            {
                case 100:
                    return Gender.MALE;
                case 0:
                    return Gender.FEMALE;
                case -1:
                    return Gender.GENDERLESS;
            }

            byte t = (byte)((Math.random() * 100) + 1);
            return t <= PERCENT_MALE ? Gender.MALE : Gender.FEMALE;
        }
    }

    private enum ExperienceGroup
    {
        ERRATIC,
        FAST,
        MEDIUM_FAST,
        MEDIUM_SLOW,
        SLOW,
        FLUCTUATING;

        public int getExpForLevel(final byte level)
        {
            switch(this)
            {
                case ERRATIC:
                    return calcErratic(level);
                case FAST:
                    return calcFast(level);
                case MEDIUM_FAST:
                   return calcMedFast(level);
                case MEDIUM_SLOW:
                    return calcMedSlow(level);
                case SLOW:
                    return calcSlow(level);
                case FLUCTUATING:
                    return calcFluctuating(level);
                default:
                    throw new IllegalStateException("Enum " + this.toString().toLowerCase() + " is illlegal");
            }
        }

        private int calcErratic(byte level)
        {
            if(level > 0 && level <= 50)
            {
                return (int)((Math.pow(level, 3) * (100 - level)) / 50);
            }
            else if(level > 50 && level <= 68)
            {
                return (int)((Math.pow(level, 3) * (150 - level)) / 100);
            }
            else if(level > 68 && level <= 98)
            {
                return (int)((Math.pow(level, 3) * ((1911 - 10 * level) / 3)) / 500);
            }
            else if(level > 98 && level <= 100)
            {
                return (int)((Math.pow(level, 3) * (160 - level)) / 100);
            }
            else
            {
                throw new IllegalArgumentException("A level of " + level + " is not allowed");
            }
        }

        private int calcFast(byte level)
        {
            if(level > 0 && level <= 100)
            {
                return (int)((4 * Math.pow(level, 3)) / 5);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcMedFast(byte level)
        {
            if(level > 0 && level <= 100)
            {
                return (int)Math.pow(level, 3);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcMedSlow(byte level)
        {
            if(level > 0 && level <= 100)
            {
                return (int)(((6 * Math.pow(level, 3)) / 5) - (15 * Math.pow(level, 2)) + (100 * level) - 140);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcSlow(byte level)
        {
            if(level > 0 && level <= 100)
            {
                return (int)((5 * Math.pow(level, 3)) / 4);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcFluctuating(byte level)
        {
            if(level > 0 && level <= 15)
            {
                return (int)(Math.pow(level, 3) * ((((level + 1) / 3) + 24) / 50));
            }
            else if(level > 15 && level <= 36)
            {
                return (int)(Math.pow(level, 3) * ((level + 14) / 50));
            }
            else if(level > 36 && level <= 100)
            {
                return (int)(Math.pow(level, 3) * (((level / 2) + 32) / 50));
            }
            else
            {
                throw new IllegalArgumentException("A level of " + level + " is not allowed");
            }
        }
    }
    private final ExperienceGroup EXP_GROUP;
    private final Species[] EVOLUTION, PREVOLUTION;
    private final GenderRatio GENDER_RATIO;
    private final short[] BASE_STATS;
    private final byte[] EV_YIELD;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private final short CATCH_RATE;
    private boolean HAS_CALCULATED_GENDER;

    Species(final String name, final String dexNumber, final short catchRate, final short[] stats, byte expYield, byte[] evYield,
            GenderRatio ratio, ExperienceGroup group, final Species[] evolvesTo, Species[] evolvesFrom, final Type... type)
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

        HAS_CALCULATED_GENDER = false;
        GENDER_RATIO = ratio;
        EV_YIELD = new byte[] {evYield[0], evYield[1], evYield[2], evYield[3], evYield[4], evYield[5]};
        BASE_STATS = new short[] {stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]};
        CATCH_RATE = catchRate;
        NAT_DEX_NUMBER = dexNumber;

        NAME = name;
        TYPE = type;

        if(evolvesFrom != null)
        {
            switch(evolvesFrom.length)
            {
                case 1:
                    PREVOLUTION = new Species[]{evolvesFrom[0]};
                    break;
                case 2:
                    PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1]};
                    break;
                case 3:
                    PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2]};
                    break;
                default:
                    PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2], evolvesFrom[3]};
                    break;
            }
        }
        else
        {
            PREVOLUTION = null;
        }

        if(evolvesTo != null)
        {
            switch(evolvesTo.length)
            {
                case 1:
                    EVOLUTION = new Species[]{evolvesTo[0]};
                    break;
                case 2:
                    EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1]};
                    break;
                case 3:
                    EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2]};
                    break;
                default:
                    EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2], evolvesTo[3]};
                    break;
            }
        }
        else
        {
            EVOLUTION = null;
        }

        EXP_GROUP = group;
    }

    public boolean hasPreEvolutions()
    {
        return PREVOLUTION != null;
    }

    public boolean hasEvolutions()
    {
        return EVOLUTION != null;
    }

    public int calculateExp(byte level)
    {
        return EXP_GROUP.getExpForLevel(level);
    }

    public boolean hasPreEvolution(Species s)
    {
        return contains(PREVOLUTION, s);
    }

    public boolean hasEvolution(Species s)
    {
        return contains(EVOLUTION, s);
    }

    private boolean contains(Species[] spec, Species s)
    {
        for(Species species : spec)
        {
            if(species == s)
            {
                return true;
            }
        }

        return false;
    }
    public byte[] getEVYields()
    {
        return EV_YIELD;
    }

    public byte getYield(final byte stat)
    {
        return EV_YIELD[stat];
    }
    public short getCatchRate()
    {
        return CATCH_RATE;
    }

    public String getDexNumber()
    {
        return NAT_DEX_NUMBER;
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

    public Gender getGender()
    {
        if(!HAS_CALCULATED_GENDER)
        {
            HAS_CALCULATED_GENDER = true;
            return GENDER_RATIO.getGender();
        }

        throw new UnsupportedOperationException("Gender can only be calculated once.");
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
    public Type[] getType()
    {
        return TYPE;
    }
}
