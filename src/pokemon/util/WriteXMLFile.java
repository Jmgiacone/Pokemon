package pokemon.util;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import pokemon.core.Stat;
import pokemon.core.Type;

public class WriteXMLFile {

    public static void main(String argv[]) {

        try {
            // root elements
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rootElement = doc.createElement("pokemonList");
            doc.appendChild(rootElement);

            // pokemon elements
            Element pokemon = doc.createElement("pokemon");
            rootElement.appendChild(pokemon);

            // name elements
            Attr name = doc.createAttribute("name");
            name.setValue("Bulbasaur");
            Attr attr = doc.createAttribute("id");
            attr.setValue("001");
            pokemon.setAttributeNode(name);
            pokemon.setAttributeNode(attr);
            //pokemon.appendChild(name);

            // catchRate elements
            Element catchRate = doc.createElement("catchRate");
            catchRate.appendChild(doc.createTextNode("45"));
            pokemon.appendChild(catchRate);

            Element[] stats = new Element[6];
            Attr[] idAttributes = new Attr[6], valAttributes = new Attr[6];
            Element baseStats = doc.createElement("baseStats");
            for(int i = Stat.HP.ordinal(); i <= Stat.SPEED.ordinal(); i++)
            {
                idAttributes[i] = doc.createAttribute("id");
                idAttributes[i].setValue(i + "");
                valAttributes[i] = doc.createAttribute("value");
                valAttributes[i].setValue("45");
                stats[i] = doc.createElement("stat");
                stats[i].setAttributeNode(idAttributes[i]);
                stats[i].setAttributeNode(valAttributes[i]);
                baseStats.appendChild(stats[i]);
            }

            pokemon.appendChild(baseStats);


           // baseExp elements
            Element baseExp = doc.createElement("expYield");
            baseExp.appendChild(doc.createTextNode("64"));
            pokemon.appendChild(baseExp);

            Element[] evYields = new Element[6];
            Element yield = doc.createElement("evYields");
            for(int i = Stat.HP.ordinal(); i <= Stat.SPEED.ordinal(); i++)
            {
                idAttributes[i] = doc.createAttribute("id");
                idAttributes[i].setValue(i + "");
                valAttributes[i] = doc.createAttribute("value");
                valAttributes[i].setValue("1");
                evYields[i] = doc.createElement("stat");
                evYields[i].setAttributeNode(idAttributes[i]);
                evYields[i].setAttributeNode(valAttributes[i]);
                yield.appendChild(evYields[i]);
            }
            pokemon.appendChild(yield);

            // genderRatio elements
            Element genderRatio = doc.createElement("genderRatio");
            genderRatio.appendChild(doc.createTextNode(".875"));
            pokemon.appendChild(genderRatio);

            Element experienceGroup = doc.createElement("experienceGroup");
            experienceGroup.appendChild(doc.createTextNode("mediumSlow"));
            pokemon.appendChild(experienceGroup);

            Element moves = doc.createElement("learnset");
            for(int i = 0; i < 4; i++)
            {
                Element move = doc.createElement("move");
                Attr moveLevel = doc.createAttribute("levelLearned");
                moveLevel.setValue("0");
                Attr moveName = doc.createAttribute("name");
                moveName.setValue("Tackle");
                move.setAttributeNode(moveLevel);
                move.setAttributeNode(moveName);
                moves.appendChild(move);
            }
            pokemon.appendChild(moves);

            Element types = doc.createElement("types");
            Element[] type = new Element[2];
            for(int i = 0; i < 2; i++)
            {
                type[i] = doc.createElement("type");
                type[i].appendChild(doc.createTextNode("Poison"));
                types.appendChild(type[i]);
            }

            pokemon.appendChild(types);
            // write the content into xml file
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("file.xml"));

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);

            System.out.println("File saved!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}