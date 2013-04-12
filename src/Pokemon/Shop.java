package Pokemon;

import java.util.Scanner;

public class Shop
{
    Scanner reader;
    String name, choice;
    Item[] wares;
    Healer nada;
    int i;
    public Shop(String name)
    {
        reader = new Scanner(System.in);
        choice = "";
        this.name = name;
        wares = new Item[]{
            Item.POTION, 
            Item.SUPER_POTION, 
            Item.FULL_RESTORE, 
            Item.ANTIDOTE, 
            Item.ETHER, 
            Ball.POKEBALL, 
            Ball.GREAT_BALL, 
            Ball.ULTRA_BALL};
        
        nada = new Healer("", -1, -1);
    }
    
    public Bag sell(Bag b, Item i)
    {
        System.out.println("");
        System.out.println("SELLING");
        //System.out.println("");
        int sold, num;
        String again;
        sold = i.getPrice() / 2;
        System.out.printf("I can pay you %d for your %s\n", sold, i.getName());
        while (true)
        {
            System.out.print("How many would you like to sell? ");
            num = reader.nextInt();
            if(b.inBag(i) < num)
            {
                System.out.println("You lied about your items!\nTry again: ");
            }
            else if(b.inBag(i) > num)
            {
                while (true)
                {
                    System.out.printf("You have more than %d %s's\nWould you like to sell more? ", num, i.getName());
                    reader.nextLine();
                    again = reader.nextLine();
                
                    if(again.equalsIgnoreCase("Yes"))
                    {
                        break;
                    }
                    else if(again.equalsIgnoreCase("No"))
                    {
                        sold *= num;
                        b.sell(i, num);
                        b.payDay(sold);
                        
                        break;
                    }
                    else
                    {
                        System.out.println("Lets try this again...");
                    }
                }
                break;
            }
            else if(b.inBag(i) == num)
            {
                sold *= num; 
                b.sell(i, num);
                b.payDay(sold);
                
                break;
            }
        }
        return b;
    }
    
    public Item chooseItem(Bag b)
    {
        System.out.println("What would you like?");
        System.out.printf("You have $%d\n", b.cash());
        System.out.println("");
        int total, num;
        for(i = 0; i < wares.length; i++)
        {
             if(wares[i].getName().equalsIgnoreCase("Full Restore"))
             {
                 System.out.printf("%s (Total HP, $%d)\n", wares[i].getName(), wares[i].getPrice());
             }
             else
             {
                 System.out.printf("%s (%d, $%d)\n", wares[i].getName(), wares[i].getPower(), wares[i].getPrice());
             }
        }
        choice = reader.nextLine();
        i = 0;
        while(!choice.equalsIgnoreCase(wares[i].getName()))
        {
             i++;
             if(i >= wares.length)
             {
                 i = 0;
                 System.out.print("That is not a legit item. Try again: ");
                 choice = reader.nextLine();
             }
        }
        
        return wares[i];
    }
    
    public Bag buy(Bag b, Item i)
    {
        int num, total;
        System.out.println("");
        System.out.println("BUYING");
        while(true)
        {
            if(b.cash() < i.getPrice())
            {
                System.out.printf("Dude, you can't even pay for 1 %s\n", i.getName());
                break;
            }
            System.out.printf("How many %s's would you like?\n", i.getName());
            num = reader.nextInt();
            total = (i.getPrice() * num);
            if(num < 0 || num > 25)
            {
                System.out.println("Try again Tim");
            }
            else if(b.cash() < total)
            {
                System.out.println("Sorry dawg, aint enough cash, try again.");
            }
            else if(b.cash >= total)
            {
                b.pay(total);
                System.out.printf("Thank you for your purchase of %d %s's\n", num, i.getName());
                if(num > 1)
                {
                    for (int j = num; j >= 1; j--)
                    {
                        b.addToBag(i);
                    }
                }
                else
                {
                    b.addToBag(i);
                }
                break;
            }
            else if(num == 0)
            {
                break;
            }
        }
        return b;
    }
    
}