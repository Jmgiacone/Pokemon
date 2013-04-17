package Pokemon.Util;

import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class PokemonUpdater
{
    public static void main(String[] args) throws MalformedURLException, IOException
    {
        URL statsUrl = new URL("http://bulbapedia.bulbagarden.net/wiki/List_of_Pok%C3%A9mon_by_base_stats"),
            typeUrl = new URL("http://bulbapedia.bulbagarden.net/wiki/Natdex#Generation_VI"),
            evYieldUrl = new URL("http://bulbapedia.bulbagarden.net/wiki/List_of_Pok%C3%A9mon_by_effort_value_yield"),
            genderRationUrl = new URL("http://bulbapedia.bulbagarden.net/wiki/List_of_Pok%C3%A9mon_by_gender_ratio");

        BufferedReader inStats = new BufferedReader(new InputStreamReader(statsUrl.openStream())),
            inTypes = new BufferedReader(new InputStreamReader(typeUrl.openStream())),
            inDex = new BufferedReader(new InputStreamReader(typeUrl.openStream())),
            inNames = new BufferedReader(new InputStreamReader(typeUrl.openStream())),
            inYields = new BufferedReader(new InputStreamReader(evYieldUrl.openStream())),
            inGenderRatio = new BufferedReader(new InputStreamReader(genderRationUrl.openStream()));

        Scanner reader = new Scanner(new File("Catch rate html.txt"));

        ArrayList<String> catchRates = new ArrayList<>(),
                names = new ArrayList<>(),
                stats = new ArrayList<>(),
                dexNum = new ArrayList<>(),
                type = new ArrayList<>(),
                evYields = new ArrayList<>(),
                xpYields = new ArrayList<>(),
                genderRatios = new ArrayList<>();

        for(int i = 0; i < 680; i++)
        {
            genderRatios.add("");
        }

        int count = 0, stat, loopNum = 1;
        String line, name, num, code, partial = "", statName, XPyield = "", evYield, ratio, currentRatio = "", ratioName;

        while((line = inYields.readLine()) != null)
        {
            if(line.contains("<a href=\"/wiki/"))
            {
                try
                {
                    statName = line.substring(line.indexOf("/wiki/") + 6, line.indexOf("_(P"));

                    switch(statName)
                    {
                        case "Castform":
                            loopNum = 4;
                            break;
                        case "Burmy":
                            loopNum = 3;
                            break;
                        case "Shellos":
                            loopNum = 2;
                            break;
                        case "Gastrodon":
                            loopNum = 2;
                            break;
                        case "Rotom":
                            loopNum = 6;
                            break;
                        case "Giratina":
                            loopNum = 2;
                            break;
                        case "Basculin":
                            loopNum = 2;
                            break;
                        case "Keldeo":
                            loopNum = 2;
                            break;
                        case "Unfezant":
                            loopNum = 2;
                            break;
                        case "Frillish":
                            loopNum = 2;
                            break;
                        case "Jellicent":
                            loopNum = 2;
                            break;
                        default:
                            loopNum = 1;
                            break;
                    }
                }
                catch(IndexOutOfBoundsException e)
                {
                    //Wasn't a name...
                }
            }
            //Get the base XP and EV yields
            if(line.contains("<td style=\"background:"))
            {
                try
                {
                    stat = Integer.parseInt(line.substring(line.indexOf("\">") + 3));

                    if(count == -1)
                    {
                        //Do nothing - skip the total evs
                        count++;
                    }
                    else if(count == 0)
                    {
                        XPyield = stat + "";
                        count++;
                    }
                    else if(count > 0 && count < 6)
                    {
                        count++;
                        partial += stat + ", ";
                    }
                    else
                    {
                        count = -1;
                        partial += stat;

                        for(int i = 0; i < loopNum; i++)
                        {
                            evYields.add(partial);
                            xpYields.add(XPyield);
                        }

                        loopNum = 1;
                        partial = "";
                    }
                }
                catch(NumberFormatException e)
                {

                }
                catch(IndexOutOfBoundsException e)
                {

                }
            }
        }
        inYields.close();

        while(reader.hasNextLine())
        {
            line = reader.nextLine();

            //Looking for the tag that denotes a Pokemon name
            if(line.contains("<td> <a href=\"/wiki/"))
            {
                //Skip a line of filler
                reader.nextLine();

                code = line.substring(line.indexOf("/wiki/") + 6, line.indexOf("_(Pok%C3%A9mon)\""));
                switch(code)
                {
                    case "Castform":
                        loopNum = 4;
                        break;
                    case "Deoxys":
                        loopNum = 4;
                        break;
                    case "Burmy":
                        loopNum = 3;
                        break;
                    case "Wormadam":
                        loopNum = 3;
                        break;
                    case "Shellos":
                        loopNum = 2;
                        break;
                    case "Gastrodon":
                        loopNum = 2;
                        break;
                    case "Rotom":
                        loopNum = 6;
                        break;
                    case "Giratina":
                        loopNum = 2;
                        break;
                    case "Shaymin":
                        loopNum = 2;
                        break;
                    case "Basculin":
                        loopNum = 2;
                        break;
                    case "Darmanitan":
                        loopNum = 2;
                        break;
                    case "Landorus":
                        loopNum = 2;
                        break;
                    case "Thundurus":
                        loopNum = 2;
                        break;
                    case "Tornadus":
                        loopNum = 2;
                        break;
                    case "Kyurem":
                        loopNum = 3;
                        break;
                    case "Keldeo":
                        loopNum = 2;
                        break;
                    case "Meloetta":
                        loopNum = 2;
                        break;
                    case "Unfezant":
                        loopNum = 2;
                        break;
                    case "Frillish":
                        loopNum = 2;
                        break;
                    case "Jellicent":
                        loopNum = 2;
                        break;
                    default:
                        loopNum = 1;
                        break;
                }

                //Take the line with the Catch Rate data on it
                code = reader.nextLine();
                code = code.substring(code.indexOf("class=\"r\">") + 11);

                //Copy it X amount of times
                for(int i = 0; i < loopNum; i++)
                {
                    catchRates.add(code);
                }
            }
        }

        loopNum = 1;
        partial = "";
        count = 0;
        while((line = inStats.readLine()) != null)
        {
            //HTML Tag denoting a Pokemon name
            if(line.contains("<a href=\"/wiki/"))
            {
                try
                {
                    statName = line.substring(line.indexOf("/wiki/") + 6, line.indexOf("_(P"));

                    switch(statName)
                    {
                        case "Castform":
                            loopNum = 4;
                            break;
                        case "Burmy":
                            loopNum = 3;
                            break;
                        case "Shellos":
                            loopNum = 2;
                            break;
                        case "Gastrodon":
                            loopNum = 2;
                            break;
                        case "Basculin":
                            loopNum = 2;
                            break;
                        case "Keldeo":
                            loopNum = 2;
                            break;
                        case "Unfezant":
                            loopNum = 2;
                            break;
                        case "Frillish":
                            loopNum = 2;
                            break;
                        case "Jellicent":
                            loopNum = 2;
                            break;
                        default:
                            loopNum = 1;
                            break;
                    }
                }
                catch(IndexOutOfBoundsException e)
                {
                    //Wasn't a name...
                }
            }

            //Get the base stats
            if(line.contains("<td style=\"background:"))
            {
                try
                {
                    stat = Integer.parseInt(line.substring(line.indexOf("\">") + 3));

                    if(count < 5)
                    {
                        count++;
                        partial += stat + ", ";
                    }
                    else
                    {
                        count = 0;
                        partial += stat;

                        for(int i = 0; i < loopNum; i++)
                        {
                            stats.add(partial);
                        }

                        loopNum = 1;
                        partial = "";
                    }
                }
                catch(NumberFormatException e)
                {

                }
                catch(IndexOutOfBoundsException e)
                {

                }
            }
        }
        inStats.close();

        String s = "";
        loopNum = 1;
        boolean found = false;

        while(type.size() < 680 && (line = inTypes.readLine()) != null)
        {
            //System.out.println(line);

            if(line.contains("<a href=\"/wiki/"))
            {
                try
                {
                    code = line.substring(line.indexOf("/wiki/") + 6, line.indexOf("_(Pok"));

                    switch(code)
                    {
                        case "Landorus":
                            loopNum = 2;
                            break;
                        case "Thundurus":
                            loopNum = 2;
                            break;
                        case "Tornadus":
                            loopNum  = 2;
                            break;
                        case "Kyurem":
                            loopNum = 3;
                            break;
                        case "Keldeo":
                            loopNum = 2;
                            break;
                        default:
                            loopNum = 1;
                            break;
                    }
                }
                catch(StringIndexOutOfBoundsException e)
                {
                    //GG
                }
            }

            //Singly typed Pokemon
            if(line.contains("<td colspan=\"2\" style=\"background:"))
            {
                s = line.substring(line.indexOf("href=\"/wiki/") + 12, line.indexOf("_(type)"));
                for(int i = 0; i < loopNum; i++)
                {
                    type.add("Type." + s.toUpperCase());
                }
                //System.out.println(s);
                s = "";
            }
            else if(line.contains("<td colspan=\"1\" style=\"background:"))
            {
                s = "Type." + line.substring(line.indexOf("href=\"/wiki/") + 12, line.indexOf("_(type)")).toUpperCase() + ", ";
            }
            else if(line.contains("<td style=\"background:"))
            {
                try
                {
                    s += "Type." + line.substring(line.indexOf("href=\"/wiki/") + 12, line.indexOf("_(type)")).toUpperCase();
                    found = true;
                }
                catch(StringIndexOutOfBoundsException e)
                {
                    //Do nothing
                }
            }
            else if(!s.equals(""))
            {
                found = true;
            }

            if(found)
            {
                //System.out.println(s);

                for(int i = 0; i < loopNum; i++)
                {
                    type.add(s);
                }

                s = "";
                found = false;
            }
        }

        loopNum = 1;
        while(names.size() < 680 && (line = inNames.readLine()) != null)
        {
            if(line.contains("<a href=\"/wiki/"))
            {
                try
                {
                    code = line.substring(line.indexOf("/wiki/") + 6, line.indexOf("_(Pok"));

                    switch(code)
                    {
                        case "Landorus":
                            loopNum = 2;
                            break;
                        case "Thundurus":
                            loopNum = 2;
                            break;
                        case "Tornadus":
                            loopNum  = 2;
                            break;
                        case "Kyurem":
                            loopNum = 3;
                            break;
                        case "Keldeo":
                            loopNum = 2;
                            break;
                        default:
                            loopNum = 1;
                            break;
                    }
                }
                catch(StringIndexOutOfBoundsException e)
                {
                    //GG
                }
            }

            if(line.contains("<a href=\"/wiki/") && line.contains("_(Pok%C3%A9mon)\" title=\"") &&
                    line.contains("(Pokémon)\">"))
            {
                try
                {
                    name = line.substring(line.indexOf("(Pokémon)\">") + 11, line.indexOf("</a>"));

                    for(int i = 0; i < loopNum; i++)
                    {
                        names.add(name);
                    }
                }
                catch(StringIndexOutOfBoundsException e)
                {
                    //Not a Pokemon name
                }
            }
        }

        loopNum = 1;
        while((line = inGenderRatio.readLine()) != null)
        {
            //System.out.println(line);

            //Header for a Classification
            if(line.contains("<h2> <span class=\"mw-headline\" id=\""))
            {
                currentRatio = line.substring(line.indexOf("id=\"") + 4, line.indexOf("\">"));
            }

            //Tag for a Pokemon Name
            if(line.contains("<td><a href=\"/wiki/"))
            {
                ratioName = line.substring(line.indexOf("/wiki/") + 6, line.indexOf("_(Pok"));

                //Ensuring it's an actual name
                if(names.contains(ratioName))
                {
                    genderRatios.set(names.indexOf(ratioName), currentRatio);
                }
            }
            //<h2> <span class="mw-headline" id="Male_only">Male only</span></h2>
            //<h2> <span class="mw-headline" id="1_.E2.99.80_:_7_.E2.99.82">1 ♀&#160;: 7 ♂</span></h2>
            //<h2> <span class="mw-headline" id="1_.E2.99.80_:_3_.E2.99.82">1 ♀&#160;: 3 ♂</span></h2>
            //<h2> <span class="mw-headline" id="1_.E2.99.80_:_1_.E2.99.82">1 ♀&#160;: 1 ♂</span></h2>
            //<h2> <span class="mw-headline" id="3_.E2.99.80_:_1_.E2.99.82">3 ♀&#160;: 1 ♂</span></h2>
            //<h2> <span class="mw-headline" id="Female_only">Female only</span></h2>
            //<h2> <span class="mw-headline" id="Genderless">Genderless</span></h2>
        }

        loopNum = 1;
        while(dexNum.size() < 680 && (line = inDex.readLine()) != null)
        {
            if(line.contains("<a href=\"/wiki/"))
            {
                try
                {
                    code = line.substring(line.indexOf("/wiki/") + 6, line.indexOf("_(Pok"));

                    switch(code)
                    {
                        case "Landorus":
                            loopNum = 2;
                            break;
                        case "Thundurus":
                            loopNum = 2;
                            break;
                        case "Tornadus":
                            loopNum  = 2;
                            break;
                        case "Kyurem":
                            loopNum = 3;
                            break;
                        case "Keldeo":
                            loopNum = 2;
                            break;
                        default:
                            loopNum = 1;
                            break;
                    }
                }
                catch(StringIndexOutOfBoundsException e)
                {
                    //GG
                }
            }

            if(line.contains("<td> <span class=\"plainlinks\"><a href"))
            {
                num = line.substring(line.indexOf("alt=\"") + 5, line.indexOf("alt=\"") + 8);
                for(int i = 0; i < loopNum; i++)
                {
                    dexNum.add(num);
                }
            }
        }

        String addon = ",";
        String[] parts;

        PrintWriter writer  = new PrintWriter(new File("Pokemon.txt"));
        for(int i = 0; i < names.size(); i++)
        {
            //parts = names.get(i).split("\\.' ");
            if(i == names.size() - 1)
            {
                addon = ";";
            }
            writer.println(names.get(i).toUpperCase() +
                    "(" + "\"" + names.get(i) +
                    "\", \"" + dexNum.get(i) +
                    "\", (short)" + catchRates.get(i) +
                    ", " +
                    "new short[] {" + stats.get(i) + "}, (byte)" +
                    xpYields.get(i) + ", " +
                    "new byte[] {" + evYields.get(i) + "}, " +
                    type.get(i) +
                    ")" + addon);
            writer.flush();
        }

        JOptionPane.showMessageDialog(null, "Pokemon Update Complete!");
    }
}
