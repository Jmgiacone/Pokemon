package pokemon.core;

public enum Stat
{
    HP, ATTACK,  DEFENSE, SP_ATTACK, SP_DEFENSE, SPEED;

    public String toString()
    {
        return Character.toUpperCase(super.toString().charAt(0)) + super.toString().substring(1).toLowerCase();
    }
}
