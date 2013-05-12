package pokemon.engine;

import pokemon.interactive.Player;

/**
 * Created with IntelliJ IDEA.
 * User: Nolan
 * Date: 5/12/13
 * Time: 12:50 PM
 * Starts the game.
 * @version 1
 */
public class Powerhouse {
    public static void main(String[] args) {
        System.out.println(Powerhouse.class.getSimpleName());
        System.out.println("Creating test player.");
        Player test = new Player("Name");
        System.out.println("Player information: " + test.toString());
    }
}
