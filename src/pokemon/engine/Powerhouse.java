package pokemon.engine;

import pokemon.core.Pokemon;
import pokemon.core.Species;
import pokemon.interactive.Player;
import pokemon.utility.WildPokemonGenerator;

import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        final String[] starters = new String[] {"Charmander", "Bulbasaur", "Squirtle"};
        boolean battle = false;
        print(Powerhouse.class.getSimpleName(), true);
        print("Please enter your players name: ", false); Player player = new Player(in.nextLine());
        print("Please type the name of the start pokemon you would like (Charmander, Bulbasaur, Squirtle): ", false);
        final String starter = in.nextLine();
        for(final Species s : Species.values()) {
            if(s.getName().equalsIgnoreCase(starter)) {
                if(player.addToParty(new Pokemon(s))) {
                    print("Added a " + s.getName() + " to your party.", true);
                }
            }
        }
        if(player.isPartyEmpty()) {
            print("Failed to add pokemon to your party, you must choose one of the three starter pokemon.", true);
        } else {
            print("Player contents: \n" + player.toString(), true);
        }

        print("Would you like to battle?: ", false); battle = in.nextLine().equalsIgnoreCase("yes") ? true : false;
        player.setBattleState(battle);
        while(player.isInBattle()) {
            final Pokemon wild = WildPokemonGenerator.generatePokemon();
            System.out.println("Wild pokemon information: " + wild);
            print("You encountered a " + wild.getName() + "!", true);
            break;
        }
    }

    public static void print(final String message, final boolean nextLine) {
        if(nextLine) { System.out.println(message); }
        else { System.out.print(message); }
    }
}
