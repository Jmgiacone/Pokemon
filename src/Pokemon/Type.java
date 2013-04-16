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

    private Type[] SUPER_EFFECTIVE, NOT_VERY_EFFECTIVE, NO_EFFECT;
    private final String[] superEffective, notVeryEffective, noEffect;
    private boolean first;

    Type(String[] superEffective, String[] notVeryEffective, String[] noEffect)
    {
        this.superEffective = superEffective;
        this.notVeryEffective = notVeryEffective;
        this.noEffect = noEffect;
        first = true;
    }

    private Type[] decipher(String[] types)
    {
        Type[] deciphered = new Type[types.length];

        for(int i = 0; i < types.length; i++)
        {
            deciphered[i] = valueOf(types[i]);
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
        if(first)
        {
            SUPER_EFFECTIVE = decipher(superEffective);
            NOT_VERY_EFFECTIVE = decipher(notVeryEffective);
            NO_EFFECT = decipher(noEffect);

            first = false;
        }
        return contains(SUPER_EFFECTIVE, p);
    }

    public boolean isNotVeryEffectiveAgainst(Type p)
    {
        if(first)
        {
            SUPER_EFFECTIVE = decipher(superEffective);
            NOT_VERY_EFFECTIVE = decipher(notVeryEffective);
            NO_EFFECT = decipher(noEffect);

            first = false;
        }
        return contains(NOT_VERY_EFFECTIVE, p);
    }

    public boolean hasNoEffectOn(Type p)
    {
        if(first)
        {
            SUPER_EFFECTIVE = decipher(superEffective);
            NOT_VERY_EFFECTIVE = decipher(notVeryEffective);
            NO_EFFECT = decipher(noEffect);

            first = false;
        }
        return contains(NO_EFFECT, p);
    }

    public boolean isNormalAgainst(Type p)
    {
        return !isSuperEffectiveAgainst(p) &&
                !isNotVeryEffectiveAgainst(p) &&
                !hasNoEffectOn(p);
    }
}
