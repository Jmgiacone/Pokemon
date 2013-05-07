package pokemon.core;

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

    private final String[] SUPER_EFFECTIVE, NOT_VERY_EFFECTIVE, NO_EFFECT;

    Type(String[] superEffective, String[] notVeryEffective, String[] noEffect)
    {
        SUPER_EFFECTIVE = superEffective;
        NOT_VERY_EFFECTIVE= notVeryEffective;
        NO_EFFECT = noEffect;
    }

    private boolean contains(String[] t, Type p)
    {
        if(t.length == 0)
        {
            return false;
        }

        for(String type : t)
        {
            if(type.equalsIgnoreCase(p + ""))
            {
                return true;
            }
        }

        return false;
    }

    private Type[] convert(String[] types)
    {
        Type[] t = new Type[types.length];

        for(int i = 0; i < t.length; i++)
        {
            t[i] = valueOf(types[i]);
        }

        return t;
    }

    /**
     * Tells whether or not this Type is Super Effective (x2) against the specified Type
     * @param t The Type to check
     * @return True or False
     */
    public boolean isSuperEffectiveAgainst(Type t)
    {
        return contains(SUPER_EFFECTIVE, t);
    }

    /**
     * Tells whether or not this Type is Not Very Effective (x.5) against the specified Type
     * @param t The Type to check
     * @return True or False
     */
    public boolean isNotVeryEffectiveAgainst(Type t)
    {
        return contains(NOT_VERY_EFFECTIVE, t);
    }

    /**
     * Tells whether or not this Type has no Effect (x0) against the specified Type
     * @param t The Type to check
     * @return True or False
     */
    public boolean hasNoEffectOn(Type t)
    {
        return contains(NO_EFFECT, t);
    }

    /**
     * Tells whether or not this Type does normal damage (x1) against the specified Type
     * @param t The Type to check
     * @return True or False
     */
    public boolean isNormalAgainst(Type t)
    {
        return !isSuperEffectiveAgainst(t) &&
                !isNotVeryEffectiveAgainst(t) &&
                !hasNoEffectOn(t);
    }

    /**
     * Gets all the types that this Type is Super Effective (x2) Against
     * @return the types that this Type is Super Effective Against
     */
    public Type[] getTypesSuperEffectiveAgainst()
    {
        return convert(SUPER_EFFECTIVE);
    }

    /**
     * Gets all the types that this Type is Not Very Effective (x.5) Against
     * @return the types that this Type is Not Very Effective Against
     */
    public Type[] getTypesNotVeryEffectiveAgainst()
    {
        return convert(NOT_VERY_EFFECTIVE);
    }

    /**
     * Gets all the types that this Type has no Effect (x0) Against
     * @return the types that this Type has no Effect (x0) Against
     */
    public Type[] getTypesNoEffectAgainst()
    {
        return convert(NO_EFFECT);
    }
}
