package decorator;

import java.util.ArrayList;

/**
 * An ASCII character.
 */
public abstract class Character {
    protected ArrayList<String> sections;

    /**
     * Creates a new character with no sections.
     * @author Brennan Cain (Brenn10)
     */
    public Character() {
        sections = new ArrayList<>();
    }

    /**
     * Draws the character.
     */
    public void draw() {
        for (String section : sections) {
            System.out.println(section);
        }
    }
}
