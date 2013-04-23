package pokemon.core;

public enum Status
{
    POISON, PARALYZE, BURN, FReeze, SLEEP, SEED, ACCURACY;

    public byte byteOrdinal()
    {
        return (byte)ordinal();
    }
}
