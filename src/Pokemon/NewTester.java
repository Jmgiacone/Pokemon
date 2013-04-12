package Pokemon;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

/*
 * Jordan Giacone
 * 5/10/11
 * Final Project as well as Exercise 15
 * This plays the Pokeon Game
 */
public class NewTester
{
    /*static Pokemon emptyPokemon = new Pokemon("Empty Pokemon Spot", "NO TYPE!"
            , 101001, -9001, 0, 0, false);
    static Pokemon[] opponents = new Pokemon[20];
    static Bag b = new Bag();
    static Pokemon[] party = new Pokemon[6];
    static int partySpot;
    static String name, gender;
    static Random r = new Random();
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        partySpot = 0;
        for(int i = 0; i < party.length; i++)
        {
            party[i] = emptyPokemon;
        }
        String choice, choice2;
        int i, pokes = -1, starterFaint;
        boolean bland = false;
        Move[] m = new Move[2];
        Shop mart = new Shop("PokeMart");
        //Instantiating Pokemons, move, and yourPokemon variables

        System.out.println("Would you like to load a game or start anew?");
        System.out.print("New or load: ");
        choice = reader.nextLine();

        if(choice.equalsIgnoreCase("new"))
        {
            intro();
            System.out.print("Please choose between Squirtle, Charmander, "
                    + "or Bulbasaur ");
            choice = reader.nextLine();
            //Choosing your starter

            while (!choice.equalsIgnoreCase("break"))
            {
                if(choice.equalsIgnoreCase("Squirtle") || 
                        choice.equalsIgnoreCase("Charmander") || 
                        choice.equalsIgnoreCase("Bulbasaur"))
                {
                    if(choice.equalsIgnoreCase("Squirtle"))
                    {
                        party[partySpot] = Squirtle();
                        for(i = 0; i < 20; i++)
                        {
                            //checking if odd (every other pokemon is bulbasaur)
                            if(i % 2 != 0)
                            {
                                opponents[i] = Bulbasaur();
                            }
                            else
                            {
                                opponents[i] = Charmander();
                            }
                        }
                        System.out.printf("Oh nice, you chose %s. %s is the "
                                + "COOLEST starter\n", party[partySpot].name(), 
                                party[partySpot].name());
                        //Squirtle is obviously best
                        choice = "break";
                    }
                    else if(choice.equalsIgnoreCase("Charmander"))
                    {
                        party[partySpot] = Charmander();
                        for(i = 0; i < 20; i++)
                        {
                            if(i % 2 != 0)
                            {
                                opponents[i] = Bulbasaur();//press enter
                            }
                            else
                            {
                                opponents[i] = Squirtle();
                            }
                        }
                        System.out.printf("Oh nice, you chose %s. He's "
                                + "pretty cool!1!\n", party[partySpot].name());
                        choice = "break";
                    }
                    else if(choice.equalsIgnoreCase("Bulbasaur"))
                    {
                        party[partySpot] = Bulbasaur();
                        for(i = 0; i < 20; i++)
                        {
                            if(i % 2 != 0)
                            {
                                opponents[i] = Squirtle();
                            }
                            else
                            {
                                opponents[i] = Charmander();
                            }
                        }
                        System.out.printf("Oh nice, you chose %s. "
                                + "They're ok i guess\n", 
                                party[partySpot].name());
                        choice = "break";
                    }
                }
                else
                {
                    System.out.print("That is not a Pokemon choice, "
                            + "choose again: ");
                    choice = reader.nextLine();
                }
            }
        }
        else if(choice.equalsIgnoreCase("Load"))
        {
            party = load(party);
        }
        else
        {
            main(args);
        }

        //Looping the options menu until -1
        while (!choice.equalsIgnoreCase("-1"))
        {
            choice = party[partySpot].dispMenu();
            //Random opponent every time
            i = r.nextInt(20);
            if(choice.equalsIgnoreCase("Battle"))
            {
                System.out.printf("Wild %s appeared (%d)\n", 
                        opponents[i].name(), opponents[i].currentHp());
                party[partySpot].attempts = 0;
                choice2 = "PREVENTION OF WHILE LOOP BREAKAGE "
                        + "(THIS VARIABLE WIL BE RESET IN 3 LINES...)";
                while (!choice2.equalsIgnoreCase("-1"))
                {
                    choice2 = party[partySpot].attackMenu();
                    if(choice2.equalsIgnoreCase("Attack"))
                    {
                        //Determining who is faster
                        if (opponents[i].getSpeed() > party[partySpot]
                                .getSpeed())
                        {
                            //starterFaint is an int, 1 is fainted starter, 
                            //0 is fainted opponent, and 1 is neither
                            starterFaint = starterSlower(party[partySpot], 
                                    opponents[i], m);
                            if(starterFaint == 1)
                            {
                                party[partySpot].revive();
                                opponents[i].resetStats();
                                i = r.nextInt(20);
                                System.out.println("Press enter...");
                                reader.nextLine();
                                System.out.println("\f");
                                choice2 = "-1";
                            }
                            else if(starterFaint == 0)
                            {
                                 //Defeat an opponent and recieve exp
                                 opponents[i].revive();
                                 party[partySpot].expGain(opponents[i]);
                                 party[partySpot].resetStats();
                                 //opponents[i].resetStats();
                                 if(party[partySpot].levelUp())
                                 {
                                     for (i = 0; i < 20; i++)
                                     {
                                        bland = opponents[i].levelUp();
                                     }
                                 }
                                 i = r.nextInt(20);
                                 System.out.println("You find some money on "
                                         + "the ground.");
                                 b.payDay(r.nextInt(100) + 100);
                                 System.out.println("Press enter...");
                                 reader.nextLine();
                                 System.out.println("\f");
                                 choice2 = "-1";
                            }
                        }
                        else if (opponents[i].getSpeed() < party[partySpot]
                                .getSpeed())
                        {
                            starterFaint = starterFaster(party[partySpot], 
                                    opponents[i], m);
                            if(starterFaint == 1)
                            {
                                party[partySpot].revive();
                                opponents[i].resetStats();
                                i = r.nextInt(20);
                                System.out.println("Press enter...");
                                reader.nextLine();
                                System.out.println("\f");
                                choice2 = "-1";
                            }
                            else if(starterFaint == 0)
                            {
                                 opponents[i].revive();
                                 party[partySpot].resetStats();
                                 party[partySpot].expGain(opponents[i]);
                                 if(party[partySpot].levelUp())
                                 {
                                     for (i = 0; i < 20; i++)
                                     {
                                        bland = opponents[i].levelUp();
                                     }
                                 }
                                 i = r.nextInt(20);
                                 System.out.println("You find some money "
                                         + "on the ground.");
                                 b.payDay(r.nextInt(100) + 100);
                                 System.out.println("Press enter...");
                                 reader.nextLine();
                                 System.out.println("\f");
                                 choice2 = "-1";
                            }
                        }
                        else if (opponents[i].getSpeed() == party[partySpot]
                                .getSpeed())
                        {
                            starterFaint = equalSpeed(party[partySpot], 
                                    opponents[i], m);
                            if(starterFaint == 1)
                            {
                                party[partySpot].revive();
                                opponents[i].resetStats();
                                i = r.nextInt(20);
                                System.out.println("Press enter...");
                                reader.nextLine();
                                System.out.println("\f");
                                choice2 = "-1";
                            }
                            else if(starterFaint == 0)
                            {
                                 opponents[i].revive();
                                 party[partySpot].resetStats();
                                 party[partySpot].expGain(opponents[i]);
                                 if(party[partySpot].levelUp())
                                 {
                                     for (i = 0; i < 20; i++)
                                     {
                                        bland = opponents[i].levelUp();
                                     }
                                 }
                                 i = r.nextInt(20);
                                 b.payDay(r.nextInt(100) + 100);
                                 System.out.println("Press enter...");
                                 reader.nextLine();
                                 System.out.println("\f");
                                 choice2 = "-1";
                            }
                        }
                    }
                    else if (choice2.equalsIgnoreCase("Stats"))
                    {
                        //Stats... obviously
                        party[partySpot].stats();
                    }
                    else if (choice2.equalsIgnoreCase("Item"))
                    {
                        Item use = b.chooseFromBag();
                        party[partySpot].useItem(use, opponents[i]);
                        
                        if(party[partySpot].prob > 0)
                        {
                            if(r.nextInt(100) + 1 >= party[partySpot].prob)
                            {
                                party[partySpot].prob = -999;
                                System.out.printf("%s hath been caught!\n", 
                                        opponents[i].name);
                                
                                if(partySpot + 1 <= 5)
                                {
                                    party[partySpot + 1] = opponents[i];
                                }
                                else
                                {
                                    System.out.println("The programmer of "
                                            + "this game needs to add a "
                                            + "Storage System");
                                }
                                //caught
                            }
                            else
                            {
                                party[partySpot].prob = -999;
                                //not caught
                            }
                        }
                        
                        //Even though i call the sell method, i'm not 
                        //selling anything
                        //What this really does is remove the item from the 
                        //bag a certain amount of times. Hence the 1 as a param.
                        b.sell(use, 1);
                        

                    }
                    else if(choice2.equalsIgnoreCase("Run"))
                    {
                        if(!party[partySpot].skipTurn)
                        {
                            if(party[partySpot].run(opponents[i]))
                            {
                                System.out.println("Got away safely!!!");
                                break;
                            }
                            else
                            {
                                System.out.println("Couldn't get away!");
                                party[partySpot].skipTurn = true;
                            }
                        }
                        else
                        {
                            System.out.println("You either already used an "
                                    + "item or you tried to run");
                        }
                    }
                }
            }
            else if (choice.equalsIgnoreCase("Stats"))
            {
                System.out.println("Stat's of who?");
                showParty();
                System.out.print("Choice: ");
                partySpot = reader.nextInt() - 1;
                party[partySpot].stats();
            }
            else if (choice.equalsIgnoreCase("Heal"))
            {
                party[partySpot].revive();
            }
            else if(choice.equalsIgnoreCase("Bag"))
            {
                bag(b);
            }
            else if(choice.equalsIgnoreCase("Shop"))
            {
                shop(mart, b);
            }
            else if(choice.equalsIgnoreCase("Save"))
            {
                save(party, b);
            }
            else if(choice.equalsIgnoreCase("Party"))
            {
                showParty();
            }
            else if(choice.equalsIgnoreCase("Quit"))
            {
                break;
            }
            else
            {
                System.out.println("Try again");
            }
        }
    }

    public static void bag(Bag b)
    {
        Scanner reader = new Scanner(System.in);
        while(true)
        {
            String choice = bagMenu();
            if(choice.equalsIgnoreCase("Show"))
            {
                System.out.printf("\f");
                b.dispBag();
                System.out.println("Press Enter...");
                reader.nextLine();
                System.out.printf("\f");
            }
            else if(choice.equalsIgnoreCase("balance"))
            {
                System.out.printf("You have %d poke in your bag\n", b.cash());
            }
            else if(choice.equalsIgnoreCase("quit"))
            {
                break;
            }
        }
    }

    public static String bagMenu()
    {
        Scanner reader = new Scanner(System.in);
        String choice;
        System.out.println("Bag");
        System.out.println("------------------------");
        System.out.println("Show Contents: Show");
        System.out.println("Check balance: balance");
        System.out.println("Quit: quit");
        System.out.println("------------------------");
        choice = reader.nextLine();

        return choice;
    }

    public static String shopMenu()
    {
        Scanner reader = new Scanner(System.in);
        String choice;
        System.out.println("------------------------");
        System.out.println("Buy");
        System.out.println("Sell");
        System.out.println("Quit");
        System.out.println("------------------------");
        choice = reader.nextLine();

        return choice;
    }

    public static Bag shop(Shop mart, Bag b)
    {
        Scanner reader = new Scanner(System.in);
        String choice;
        Healer item;
        System.out.println("Hello, how may i help you today?");

        while(true)
        {
            choice = shopMenu();
            if(choice.equalsIgnoreCase("Buy"))
            {
                mart.buy(b, mart.chooseItem(b));
            }
            else if(choice.equalsIgnoreCase("Sell"))
            {
                mart.sell(b, b.chooseFromBag());
            }
            else if(choice.equalsIgnoreCase("Quit"))
            {
                break;
            }
            else
            {
                System.out.print("Nope, try again: ");
            }
        }
        return b;
    }

    public static void intro()
    {
        System.out.println("POKEMON TEXT SIMULATOR");
        System.out.println("By: Jordan Giacone\n");

        System.out.print("Oh, hello. I must have overslept.Allow me to "
                + "introduce myself. My name is Oak, the professor.\nI "
                + "know i have a dumb name but every town in Kanto is "
                + "named after a color, so comparitively, it's not so "
                + "bad.\nNow that you know that i'm not some random hobo "
                + "off the streets, will you please tell me your name? ");
        name = reader.nextLine();
        System.out.printf("Very well %s, today you start your very own "
                + "Pokemon journey.\nI suggest that you buckle up because it's "
                + "gonna be an awesome ride!\n", name);
    }
    
    public static void showParty()
    {
        for(int i = 0; i < party.length; i++)
        {
            if(party[i].name.equalsIgnoreCase("Empty Pokemon Spot"))
            {
                System.out.printf("Slot %d. %s\n", i + 1, party[i].name);
            }
            else
            {
                System.out.printf("Slot %d. %s Level: %d (%d Hp)\n", i + 1, 
                        party[i].name, party[i].level, party[i].currentHp);
        }   }
    }
    //instantiating new Squirtles (opponents and starters)
    public static Pokemon Squirtle()
    {
        Pokemon squirtle = new Pokemon("Squirtle", "Water", 48, 65, 44, 43, 
                true);

        squirtle.moves(tackle);
        squirtle.moves(tailWhip);
        squirtle.moves(empty);
        squirtle.moves(empty);
        return squirtle;
    }

    
    //instantiating new Charmanders (opponents and starters)
    public static Pokemon Charmander()
    {
        Pokemon poke = new Pokemon("Charmander", "Fire", 52, 43, 39, 65, true);
        poke.moves(scratch);
        poke.moves(growl);
        poke.moves(empty);
        poke.moves(empty);
        return poke;
    }

    
    //instantiating new Bulbasaurs (opponents and starters)
    public static Pokemon Bulbasaur()
    {
        Pokemon poke = new Pokemon("Bulbasaur", "Grass", 49, 49, 45, 45, true);
        poke.moves(tackle);
        poke.moves(growl);
        poke.moves(empty);
        poke.moves(empty);
        return poke;
    }

    

    //fight methods
    public static int starterSlower(Pokemon starter, Pokemon opponents, 
            Move[] m)
    {
        Random r = new Random();
        boolean starterFaint, opponentFaint, bland;

        if(starter.skipTurn)
        {

        }
        else
        {
            m[0] = starter.humanAttackMenu();
        }

        m[1] = opponents.attack();
        starterFaint = starter.takeDamage(m[1], opponents);
        if(starterFaint)
        {
            return 1;
        }

        if(!starter.skipTurn)
        {
            opponentFaint = opponents.takeDamage(m[0], starter);
            if(opponentFaint)
            {
                return 0;
            }
        }
        else
        {
            System.out.println("Using an item or trying to run skips your "
                    + "turn!");
            starter.skipTurn = false;
        }
        return -1;
    }

    public static int starterFaster(Pokemon starter, Pokemon opponents, 
            Move[] m)
    {
        Random r = new Random();
        double yourPower, theirPower;
        boolean starterFaint, opponentFaint, bland;
        int i = 0;

        if(!starter.skipTurn)
        {
            m[i] = starter.humanAttackMenu();
            opponentFaint = opponents.takeDamage(m[i], starter);

            if(opponentFaint)
            {
                //Return 0 is opponent has fainted
                return 0;
            }
        }
        else
        {
            System.out.println("Using an item or trying to run skips "
                    + "your turn!");
            starter.skipTurn = false;
        }
        i++;

        m[i] = opponents.attack();
        starterFaint = starter.takeDamage(m[i], opponents);

        if(starterFaint)
        {
           //Return true is your pokemon faints
           return 1;
        }
        return -1;
    }

    public static int equalSpeed(Pokemon starter, Pokemon opponents, Move[] m)
    {
        Random r = new Random();
        int faint;

        if(r.nextInt(2) == 1)
        {
            faint = starterFaster(starter,opponents, m);

        }
        else
        {
            faint = starterSlower(starter, opponents, m);

        }
        return faint;
    }
    
    public static void save(Pokemon[] p, Bag b) throws IOException
    {
        Scanner reader = new Scanner(System.in);
        File file1 = new File("Save1.txt"), file2 = new File("Save2.txt"), 
                file3 = new File("Save3.txt"), fileNum = new File("NADAAA");
        System.out.println("Choose a file to overwrite");
        fileHeaders(file1);
        fileHeaders(file2);
        fileHeaders(file3);
        System.out.print("Choice: ");
        int choice = reader.nextInt();
        if(choice == 1)
        {
            fileNum = file1;
        }
        else if(choice == 2)
        {
            fileNum = file2;
        }
        else if(choice == 3)
        {
            fileNum = file3;
        }
        else
        {
            System.out.println("There are only 3 slots!");
            save(p, b);
        }
        PrintWriter out = new PrintWriter(fileNum);
        
        Item[] items;
        for(int j = 0; j < p.length; j++)
        {
            for(int i = 0; i < 4; i++)
            {
                out.println(p[j].moveSet[i].name);
            }
            out.println(p[j].name);
            out.println(p[j].type);
            out.println(p[j].baseAttack);
            out.println(p[j].baseDefense);
            out.println(p[j].baseHp);
            out.println(p[j].baseSpeed);
            out.println(p[j].level);
            out.println(p[j].exp);
            out.println(p[j].speedIv);
            out.println(p[j].attackIv);
            out.println(p[j].defenseIv);
            out.println(p[j].hpIv);
        }
        out.println(b.cash());
    
        items = b.getContents();
        for(int i = 0; i < 25; i++)
        {
            if(i == 24)
            {
                out.print(items[i].name);
            }
            else
            {
                out.println(items[i].name);
            }
        }
        out.close();  

    System.out.println("Your file has been written");
    }
    public static void fileHeaders(File f) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(f);
        String name = "UNINITIALIZZZED", nameHolder = "not done", holder = "-5";
        int level = 0;
        if(!scanner.hasNextLine())
        {
            System.out.printf("====%s====\n", f.getName());
            System.out.println("EMPTY");
        }
        else
        {
            for(int i = 0; i < 15; i++)
            {

                if(i == 4)
                {
                    name = scanner.nextLine();
                }
                if(i == 9)
                {
                    level = scanner.nextInt();
                }
                if(i <= 5)
                {
                    nameHolder = scanner.nextLine();
                }
                else
                {
                    holder = scanner.nextLine();
                }
            }
            System.out.printf("====%s====\n", f.getName());
            System.out.printf("%s Lvl: %d\n", name, level);
        }
    }
    public static Pokemon[] load(Pokemon[] starter) throws IOException
    {
        Scanner reader = new Scanner(System.in);
        File file1 = new File("Save1.txt"), file2 = new File("Save2.txt"), 
                file3 = new File("Save3.txt"), fileNum = new File("NADAAA.txt");
        System.out.println("Choose a file to load");
        fileHeaders(file1);
        fileHeaders(file2);
        fileHeaders(file3);
        System.out.print("Choice: ");
        int choice = reader.nextInt();
        if(choice == 1)
        {
            fileNum = file1;
        }
        else if(choice == 2)
        {
            fileNum = file2;
        }
        else if(choice == 3)
        {
            fileNum = file3;
        }
        else
        {
            System.out.println("There are only 3 slots!");
            load(starter);
        }
        Scanner scanner = new Scanner(fileNum);
        int[] stats = new int[10];
        String[] names = new String[6];
        Move[] moves = new Move[4];
        String[] items = new String[25];
        Item[] bagItems = new Item[25];
        int i = 0, count = 0, array = 0, line = 1, cash;

        if(!scanner.hasNextLine())
        {
            System.out.println("The current save slot is empty. "
                    + "Unable to load\n");
            main(names);
        }
        for(int j = 0; j < starter.length; j++)
        {
            if(j > 0)
            {
                scanner.nextLine();
            }
            count = i;
            while (i < count + 6)
            {
                names[array] = scanner.nextLine();
                array++;
                i++;
                line++;
            }

            array = 0;
            count = i;

            while (i < count + 10)
            {
                stats[array] = scanner.nextInt();
                array++;
                i++;
                line++;
            }
            array = 0;
            count = i;
            

            for(int k = 0; k < 4; k++)
            {
                if(names[k].equalsIgnoreCase(tackle.name))
                {
                    moves[k] = tackle;
                }
                else if(names[k].equalsIgnoreCase(scratch.name))
                {
                    moves[k] = scratch;
                }
                else if(names[k].equalsIgnoreCase(growl.name))
                {
                     moves[k] = growl;
                }
                else if(names[k].equalsIgnoreCase(empty.name))
                {
                     moves[k] = empty;
                }
                else if(names[k].equalsIgnoreCase(tailWhip.name))
                {
                     moves[k] = tailWhip;
                }
                else if(names[k].equalsIgnoreCase(bubble.name))
                {
                     moves[k] = bubble;
                }
                else if(names[k].equalsIgnoreCase(tailWhip.name))
                {
                     moves[k] = tailWhip;
                }
                else if(names[k].equalsIgnoreCase(rapidSpin.name))
                {
                     moves[k] = rapidSpin;
                }
                else if(names[k].equalsIgnoreCase(withdraw.name))
                {
                     moves[k] = withdraw;
                }
                else if(names[k].equalsIgnoreCase(waterGun.name))
                {
                     moves[k] = waterGun;
                }
                else if(names[k].equalsIgnoreCase(bite.name))
                {
                     moves[k] = bite;
                }
                else if(names[k].equalsIgnoreCase(ember.name))
                {
                     moves[k] = ember;
                }
                else if(names[k].equalsIgnoreCase(smokeScreen.name))
                {
                     moves[k] = smokeScreen;
                }
                else if(names[k].equalsIgnoreCase(dragonRage.name))
                {
                     moves[k] = dragonRage;
                }
                else if(names[k].equalsIgnoreCase(scaryFace.name))
                {
                     moves[k] = scaryFace;
                }
                else if(names[k].equalsIgnoreCase(fireFang.name))
                {
                     moves[k] = fireFang;
                }
                else if(names[k].equalsIgnoreCase(leechSeed.name))
                {
                     moves[k] = leechSeed;
                }
                else if(names[k].equalsIgnoreCase(vineWhip.name))
                {
                     moves[k] = vineWhip;
                }
                else if(names[k].equalsIgnoreCase(poisonPowder.name))
                {
                     moves[k] = poisonPowder;
                }
                else if(names[k].equalsIgnoreCase(takeDown.name))
                {
                     moves[k] = takeDown;
                }
                else if(names[k].equalsIgnoreCase(razorLeaf.name))
                {
                     moves[k] = razorLeaf;
                }
                else
                {
                    System.out.printf("This programmer forgot to program "
                            + "s into the game...\n", names[k]);
                }
                
            }
            
            starter[j] = new Pokemon(moves, names[4], names[5], stats[0], 
                    stats[1], stats[2], stats[3], stats[4], stats[5], 
                    stats[6], stats[7], stats[8], stats[9], false);
            
        }
        //do this shit later
        scanner.nextLine();
        cash = scanner.nextInt();
        i = 0;
        scanner.nextLine();
        while(scanner.hasNextLine())
        {
            items[i] = scanner.nextLine();
            i++;
        }
        for(i = 0; i < items.length; i++)
        {
            if(items[i].equalsIgnoreCase(potion.name))
            {
                bagItems[i] = potion;
            }
            else if(items[i].equalsIgnoreCase(superPotion.name))
            {
                bagItems[i] = superPotion;
            }
            else if(items[i].equalsIgnoreCase(fullRestore.name))
            {
                bagItems[i] = fullRestore;
            }
            else if(items[i].equalsIgnoreCase(antidote.name))
            {
                bagItems[i] = antidote;
            }
            else if(items[i].equalsIgnoreCase(ether.name))
            {
                bagItems[i] = ether;
            }
            else if(items[i].equalsIgnoreCase(emptyItem.name))
            {
                bagItems[i] = emptyItem;
            }
            else
            {
                System.out.printf("This programmer forgot to program %s "
                        + "into the game...\n", items[i]);
            }
        }
        b = new Bag(bagItems, cash);

        if(starter[0].name.equalsIgnoreCase("Squirtle"))
        {
            for(i = 0; i < 20; i++)
            {
                //checking if odd (every other pokemon is bulbasaur)
                if(i % 2 != 0)
                {
                    opponents[i] = Bulbasaur();
                }
                else
                {
                    opponents[i] = Charmander();
                }
             }
        }
        else if(starter[0].name.equalsIgnoreCase("Charmander"))
        {
           for(i = 0; i < 20; i++)
           {
               if(i % 2 != 0)
               {
                   opponents[i] = Bulbasaur();
               }
               else
               {
                   opponents[i] = Squirtle();
               }
           }
        }
        else if(starter[0].name.equalsIgnoreCase("Bulbasaur"))
        {
            for(i = 0; i < 20; i++)
            {
                if(i % 2 != 0)
                {
                    opponents[i] = Squirtle();
                }
                else
                {
                    opponents[i] = Charmander();
                }
            }
        }

        for(int j = 0; j < (starter[0].level - 5); j++)
        {
            for(i = 0; i < 20; i++)
            {
                boolean bland = opponents[i].levelUp();
            }
        }
        System.out.printf("%s and company have been loaded\n", starter[0].
                name());
        //Move[] newMoves, String newName, String newType, int newAttack, 
        //int newDefense, int newHp, int newSpeed, int newLevel, int newExp, 
        //int newSpeedIv, int newAttackIv, int newDefenseIv, int newHpIv

        return starter;
    }*/
}