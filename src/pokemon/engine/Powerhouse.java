package pokemon.engine;

import pokemon.core.Move;
import pokemon.core.Pokemon;
import pokemon.core.Species;
import pokemon.interactive.Player;
import pokemon.util.WildPokemonGenerator;

import java.util.Arrays;
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
        boolean isBattling = false;
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
            System.exit(0);
        } else {
            print("Player contents: \n" + player.toString(), true);
        }

        print("Would you like to battle?: ", false);
        isBattling = in.nextLine().equalsIgnoreCase("yes");
        player.setBattleState(isBattling);
        final Pokemon wild = WildPokemonGenerator.generatePokemon();
        while(player.isInBattle()) {
            System.out.println("Wild pokemon information: " + wild);
            print("You encountered a " + wild.getName() + "!", true);
            print("Move set: " + Arrays.toString(player.getParty()[0].getMoveSet()) + ", type the name of the move you want to use.", true);
            final Battle battle = new Battle(player, wild);
            final String moveParse = in.nextLine();
            Move moveSelected = null;
            for(final Move m : player.getParty()[0].getMoveSet()) {
                try {
                    if(m == Move.valueOf(moveParse)) {
                        moveSelected = m;
                    }
                } catch(IllegalArgumentException e) {
                    //lol trolled
                }
            }
            if(moveSelected == null) {
                print("Move not recognized.", true);
                continue;
                //TODO - add a goto label to input another move
            }
            wild.applyMove(moveSelected);
            break;
        }
    }

    public static void print(final String message, final boolean nextLine) {
        if(nextLine) { System.out.println(message); }
        else { System.out.print(message); }
    }
}
