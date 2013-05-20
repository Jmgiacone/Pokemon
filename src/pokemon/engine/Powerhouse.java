package pokemon.engine;

import pokemon.core.Move;
import pokemon.core.Pokemon;
import pokemon.core.Species;
import pokemon.core.Stat;
import pokemon.interactive.Player;
import pokemon.interactive.Pokecenter;
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
        final String[][] starters = new String[][]{
                {"Bulbasaur", "Charmander", "Squirtle"},
                {"Chikorita", "Cyndaquil", "Totodile"},
                {"Treecko", "Torchic", "Mudkip"},
                {"Turtwig", "Chimchar", "Piplup"},
                {"Snivy", "Tepig", "Oshawott"}};
        final String[] regions = new String[] {"Kanto", "Johto", "Hoenn", "Sinnoh", "Unova"},
        options = new String[] {"Battle", "Heal", "Quit"};
        System.out.println("Welcome to the wonderful world of Pokemon! Our names are Professors Giacone and Hoffmann." +
                "\nOur job is to ensure that you start smoothly on your very own Pokemon Journey!" +
                "\nWe are very fortunate to have recently caught fresh starter Pokemon from each region!" +
                "\nThere are 5 different regions to choose from: Kanto, Johto, Hoenn, Sinnoh, and Unova." +
                "\nYou may only choose a single starter Pokemon, so choose wisely.");
        System.out.print("First things first. What's your name? ");
        Player p = new Player(in.nextLine());
        System.out.print("Okay " + p.getName() + ", let's choose a region. Choose between Kanto, Johto, Hoenn, Sinnoh, and Unova. ");

        String choice = in.nextLine();
        while(!contains(regions, choice))
        {
            System.out.println(choice + " isn't a valid region. Try again");
            choice = in.nextLine();
        }

        byte index;

        switch(choice.toUpperCase())
        {
            case "KANTO":
                index = 0;
                break;
            case "JOHTO":
                index = 1;
                break;
            case "HOENN":
                index  = 2;
                break;
            case "SINNOH":
                index = 3;
                break;
            case "UNOVA":
                index = 4;
                break;
            default:
                throw new IllegalArgumentException(choice + " somehow bypassed the region check");
        }

        System.out.println("Great! You chose the " + choice + " region!" +
                "\nThe " + choice + " region has " + Arrays.toString(starters[index]) + " to choose from!" +
                "\nTake your pick!");
        choice = in.nextLine();

        while(!contains(starters[index], choice))
        {
            System.out.println(choice + " is not a starter in this region. The starters are: " + Arrays.toString(starters[index]) + ". Please try again");
            choice  = in.nextLine();
        }

        System.out.println("Congratulations on choosing a " + choice + "!" +
                "\nTake good care of it and have fun on your very own Pokemon journey!");

        p.addToParty(new Pokemon(Species.valueOf(choice.toUpperCase().replace(" ", "_"))));

        boolean quit = false;

        while(!quit)
        {
            do
            {
                System.out.println(p.getParty()[0] + "\nWhat would you like to do?" +
                        "\n" + Arrays.toString(options));
                choice = in.nextLine();
            }
            while(!contains(options, choice));

            switch(choice.toUpperCase())
            {
                case "BATTLE":
                    battle(p);
                    break;
                case "HEAL":
                    Pokecenter.healParty(p);
                    break;
                case "QUIT":
                    quit = true;
                    break;
                default:
                    throw new IllegalArgumentException(choice + " isn't a choice!");
            }
        }

        System.out.println("\nThanks for playing! We hope to see you again!");
    }

    private static void battle(Player player)
    {
        Scanner in  = new Scanner(System.in);
        final Pokemon wild = WildPokemonGenerator.generatePokemon();

        System.out.println("Encountered a wild " + wild + "!");

        final Battle battle = new Battle(player, wild);

        while(battle.isRunning())
        {
            System.out.println(battle);
            System.out.println("Move set: " + Arrays.toString(player.getParty()[0].getMoveSet()) + ", type the name of the move you want to use, <Run> to run away.");
            String choice = in.nextLine();

            if(choice.equalsIgnoreCase("Run"))
            {
                //TODO Implement the running away formula
                System.out.println("Got away successfully!");
                break;
            }

            try
            {
                System.out.println(battle.useMove(Move.valueOf(choice.toUpperCase().replace(" ", "_"))));
            }
            catch(Exception e)
            {
                System.err.println(choice + " is not a valid move");
                e.printStackTrace();
            }
        }
    }

    private static boolean contains(String[] list, String elt)
    {
        for(String s : list)
        {
            if(s.equalsIgnoreCase(elt))
            {
                return true;
            }
        }

        return false;
    }
}
