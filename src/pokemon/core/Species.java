package pokemon.core;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public enum Species
{
    BULBASAUR,
    IVYSAUR,
    VENUSAUR,
    CHARMANDER,
    CHARMELEON,
    CHARIZARD,
    SQUIRTLE,
    WARTORTLE,
    BLASTOISE,
    CATERPIE,
    METAPOD,
    BUTTERFREE,
    WEEDLE,
    KAKUNA,
    BEEDRILL,
    PIDGEY,
    PIDGEOTTO,
    PIDGEOT,
    RATTATA,
    RATICATE,
    SPEAROW,
    FEAROW,
    EKANS,
    ARBOK,
    PIKACHU,
    RAICHU,
    SANDSHREW,
    SANDSLASH,
    NIDORAN_FEMALE,
    NIDORINA,
    NIDOQUEEN,
    NIDORAN_MALE,
    NIDORINO,
    NIDOKING,
    CLEFAIRY,
    CLEFABLE,
    VULPIX,
    NINETALES,
    JIGGLYPUFF,
    WIGGLYTUFF,
    ZUBAT,
    GOLBAT,
    ODDISH,
    GLOOM,
    VILEPLUME,
    PARAS,
    PARASECT,
    VENONAT,
    VENOMOTH,
    DIGLETT,
    DUGTRIO,
    MEOWTH,
    PERSIAN,
    PSYDUCK,
    GOLDUCK,
    MANKEY,
    PRIMEAPE,
    GROWLITHE,
    ARCANINE,
    POLIWAG,
    POLIWHIRL,
    POLIWRATH,
    ABRA,
    KADABRA,
    ALAKAZAM,
    MACHOP,
    MACHOKE,
    MACHAMP,
    BELLSPROUT,
    WEEPINBELL,
    VICTREEBEL,
    TENTACOOL,
    TENTACRUEL,
    GEODUDE,
    GRAVELER,
    GOLEM,
    PONYTA,
    RAPIDASH,
    SLOWPOKE,
    SLOWBRO,
    MAGNEMITE,
    MAGNETON,
    FARFETCH_D,
    DODUO,
    DODRIO,
    SEEL,
    DEWGONG,
    GRIMER,
    MUK,
    SHELLDER,
    CLOYSTER,
    GASTLY,
    HAUNTER,
    GENGAR,
    ONIX,
    DROWZEE,
    HYPNO,
    KRABBY,
    KINGLER,
    VOLTORB,
    ELECTRODE,
    EXEGGCUTE,
    EXEGGUTOR,
    CUBONE,
    MAROWAK,
    HITMONLEE,
    HITMONCHAN,
    LICKITUNG,
    KOFFING,
    WEEZING,
    RHYHORN,
    RHYDON,
    CHANSEY,
    TANGELA,
    KANGASKHAN,
    HORSEA,
    SEADRA,
    GOLDEEN,
    SEAKING,
    STARYU,
    STARMIE,
    MR_MIME,
    SCYTHER,
    JYNX,
    ELECTABUZZ,
    MAGMAR,
    PINSIR,
    TAUROS,
    MAGIKARP,
    GYARADOS,
    LAPRAS,
    DITTO,
    EEVEE,
    VAPOREON,
    JOLTEON,
    FLAREON,
    PORYGON,
    OMANYTE,
    OMASTAR,
    KABUTO,
    KABUTOPS,
    AERODACTYL,
    SNORLAX,
    ARTICUNO,
    ZAPDOS,
    MOLTRES,
    DRATINI,
    DRAGONAIR,
    DRAGONITE,
    MEWTWO,
    MEW;

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

    private final String NAT_DEX_NUMBER;

    private static int count = 1;
    Species()
    {
        NAT_DEX_NUMBER = "";
    }

    public String getName()
    {
        return super.toString().charAt(0) + super.toString().substring(1).toLowerCase();
    }

    public Gender getGender()
    {
        return Gender.FEMALE;
    }

    public int calculateExp(int a)
    {
        return 0;
    }

    public short getExpYield()
    {
        return 0;
    }

    public Map<Move, Integer> getLearnset()
    {
        return null;
    }

    public Type[] getType()
    {
        return null;
    }

    public short getBaseStat(final int stat) throws ArrayIndexOutOfBoundsException
    {
        return 0;
    }
}
