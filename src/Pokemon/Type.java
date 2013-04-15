package Pokemon;

public enum Type
{
    NORMAL(new String[]{},
            new String[]{"Rock", "Steel"},
            new String[]{"Ghost"}),
    FIGHTING(new String[]{"Normal", "Rock", "Steel", "Ice", "Dark"},
            new String[]{"Flying", "Poison", "Bug", "Psychic"},
            new String[]{"Ghost"}),
    FLYING(new String[]{"Fighting", "Grass"},
            new String[]{"Rock", "Steel", "Electric"},
            new String[]{}),
    POISON(new String[]{"Grass"},
            new String[]{"Poison", "Ground", "Rock", "Bug"},
            new String[]{"Steel"}),
    GROUND(new String[]{"Poison", "Rock", "Steel", "Fire", "Electric"},
            new String[]{"Bug", "Grass"},
            new String[]{"Flying"}),
    ROCK(new String[]{"Flying", "Bug", "Fire"},
            new String[]{"Fighting", "Ground", "Steel"},
            new String[]{}),
    BUG(new String[]{"Grass", "Psychic", "Dark"},
            new String[]{"Fighting", "Flying", "Poison", "Ghost", "Steel", "Fire"},
            new String[]{}),
    GHOST(new String[]{"Ghost", "Psychic"},
            new String[]{"Steel", "Dark"},
            new String[]{"Normal"}),
    STEEL(new String[]{"Rock", "Ice"},
            new String[]{"Steel", "Fire", "Water", "Electric"},
            new String[]{}),
    FIRE(new String[]{"Grass", "Ice", "Bug"},
            new String[]{"Fire", "Water", "Rock", "Dragon"},
            new String[]{}),
    WATER(new String[]{"Fire", "Rock", "Ground"},
            new String[]{"Water", "Grass", "Dragon"},
            new String[]{}),
    GRASS(new String[]{"Water", "Ground", "Rock"},
            new String[]{"Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel"},
            new String[]{}),
    ELECTRIC(new String[]{"Water", "Flying"},
            new String[]{"Grass", "Electric", "Dragon"},
            new String[]{"Ground"}),
    PSYCHIC(new String[]{"Fighting", "Poison"},
            new String[]{"Psychic", "Steel"},
            new String[]{"Dark"}),
    ICE(new String[]{"Grass", "Ground", "Flying", "Dragon"},
            new String[]{"Fire", "Water", "Ice", "Steel"},
            new String[]{}),
    DRAGON(new String[]{"Dragon"},
            new String[]{"Steel"},
            new String[]{}),
    DARK(new String[]{"Psychic", "Ghost"},
            new String[]{"Fighting", "Dark", "Steel"},
            new String[]{});

    private final Type[] SUPER_EFFECTIVE, NOT_VERY_EFFECTIVE, NO_EFFECT;

    Type(String[] superEffective, String[] notVeryEffective, String[] noEffect)
    {
        SUPER_EFFECTIVE = decipher(superEffective);
        NOT_VERY_EFFECTIVE = decipher(notVeryEffective);
        NO_EFFECT = decipher(noEffect);
    }

    private Type[] decipher(String[] types)
    {
        Type[] deciphered = new Type[types.length];
        Type t;

        for(int i = 0; i < types.length; i++)
        {
            switch(types[i])
            {
                case "Grass":
                    t = GRASS;
                    break;
                case "Water":
                    t = WATER;
                    break;
                case "Rock":
                    t = ROCK;
                    break;
                case "Ground":
                    t = GROUND;
                    break;
                case "Ghost":
                    t = GHOST;
                    break;
                case "Dragon":
                    t = DRAGON;
                    break;
                case "Fire":
                    t = FIRE;
                    break;
                case "Normal":
                    t = NORMAL;
                    break;
                case "Fighting":
                    t = FIGHTING;
                    break;
                case "Psychic":
                    t = PSYCHIC;
                    break;
                case "Dark":
                    t = DARK;
                    break;
                case "Electric":
                    t = ELECTRIC;
                    break;
                case "Flying":
                    t = FLYING;
                    break;
                case "Ice":
                    t = ICE;
                    break;
                case "Steel":
                    t = STEEL;
                    break;
                case "Poison":
                    t = POISON;
                    break;
                case "Bug":
                    t = BUG;
                    break;
                default:
                    throw new IllegalArgumentException("Type " + types[i] + " is not a real type");
            }

            deciphered[i] = t;
        }

        return deciphered;
    }

    private boolean contains(Type[] t, Type p)
    {
        if(t.length == 0)
        {
            return false;
        }

        for(Type type : t)
        {
            if(type == p)
            {
                return true;
            }
        }

        return false;
    }

    public boolean isSuperEffectiveAgainst(Type p)
    {
        return contains(SUPER_EFFECTIVE, p);
    }

    public boolean isNotVeryEffectiveAgainst(Type p)
    {
        return contains(NOT_VERY_EFFECTIVE, p);
    }

    public boolean hasNoEffectOn(Type p)
    {
        return contains(NO_EFFECT, p);
    }

    public boolean isNormalAgainst(Type p)
    {
        return !isSuperEffectiveAgainst(p) &&
                !isNotVeryEffectiveAgainst(p) &&
                !hasNoEffectOn(p);
    }
}
