package Pokemon;

public enum Nature
{
    HARDY,
    LONELY(Stat.ATTACK, Stat.DEFENSE),
    BRAVE(Stat.ATTACK, Stat.SPEED),
    ADAMANT(Stat.ATTACK, Stat.SP_ATTACK),
    NAUGHTY(Stat.ATTACK, Stat.SP_DEFENSE),
    BOLD(Stat.DEFENSE, Stat.ATTACK),
    DOCILE,
    RELAXED(Stat.DEFENSE, Stat.SPEED),
    IMPISH(Stat.DEFENSE, Stat.SP_ATTACK),
    LAX(Stat.DEFENSE, Stat.SP_DEFENSE),
    TIMID(Stat.SPEED, Stat.ATTACK),
    HASTY(Stat.SPEED, Stat.DEFENSE),
    SERIOUS,
    JOLLY(Stat.SPEED, Stat.SP_ATTACK),
    NAIVE(Stat.SPEED, Stat.SP_DEFENSE),
    MODEST(Stat.SP_ATTACK, Stat.ATTACK),
    MILD(Stat.SP_ATTACK, Stat.DEFENSE),
    QUIET(Stat.SP_ATTACK, Stat.SPEED),
    BASHFUL,
    RASH(Stat.SP_ATTACK, Stat.SP_DEFENSE),
    CALM(Stat.SP_DEFENSE, Stat.ATTACK),
    GENTLE(Stat.SP_DEFENSE, Stat.DEFENSE),
    SASSY(Stat.SP_DEFENSE, Stat.SPEED),
    CAREFUL(Stat.SP_DEFENSE, Stat.SP_ATTACK),
    QUIRKY;

    private Stat STAT_INCREASED, STAT_DECREASED;

    Nature(Stat increase, Stat decrease)
    {
        STAT_INCREASED = increase;
        STAT_DECREASED = decrease;
    }

    Nature()
    {
        STAT_DECREASED = null;
        STAT_INCREASED = null;
    }

    public Stat getStatIncreased()
    {
        return STAT_INCREASED;
    }

    public Stat getStatDecreased()
    {
        return STAT_DECREASED;
    }
}
