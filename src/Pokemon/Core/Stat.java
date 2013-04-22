package Pokemon.Core;

public enum Stat
{
    HP, ATTACK,  DEFENSE, SP_ATTACK, SP_DEFENSE, SPEED;

    public byte byteOrdinal()
    {
        return (byte)ordinal();
    }
}
