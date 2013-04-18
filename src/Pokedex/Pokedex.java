package Pokedex;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import Pokemon.*;

/**
 * User: Nolan
 * Date: 4/18/13
 * Time: 4:01 PM
 */
public class Pokedex {
    private List<Pokemon> list = new ArrayList<Pokemon>();

    /**
     * Creates a new Pokedex object and uses the loadListFromSave method to load data from the save file specified.
     * @param save The text file to load from.
     */
    public Pokedex(final String save) {
        loadListFromSave(save);
    }

    /**
     * Loads data from the save file specified.
     * @param save The text file to load from.
     */
    public void loadListFromSave(final String save) {
        //TODO - see below TODO
    }

    /**
     * A method that runs at the start of any specific event where there is a possibility of a new entry.
     */
    public void store() {
        //TODO - no idea how the fuck to do this without other classes getting finished.
    }

    /**
     * Searches for pokemon in the pokedex by name.
     * @param name The name of pokemon to search.
     * @return The pokemon returned.
     */
    public List<Pokemon> searchByName(final String name) {
        List<Pokemon> found = new ArrayList<Pokemon>();

        for(final Pokemon p : this.list) {
            if(p.getName().contains(name)) {
                found.add(p);
            }
        }
        return found;
    }

    /**
     * Searches for pokemon in the pokedex by type.
     * @param type The type of pokemon to search.
     * @return The pokemon returned.
     */
    public List<Pokemon> searchByType(final Type type) {
        List<Pokemon> found = new ArrayList<Pokemon>();

        for(final Pokemon p : this.list) {
            for(final Type t : p.getType()) {
                if(t == type) {
                    found.add(p);
                    break;
                }
            }
        }
        return found;
    }

    /**
     * Gets the sprite image for the pokemon specified.
     * @param p The pokemon to get the sprite of.
     * @return The image of the sprite.
     */
    public Image displaySprite(final Pokemon p) {
        return null;
    }
}
