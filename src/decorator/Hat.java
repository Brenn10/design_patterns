package decorator;

/**
 * Adds a hat to a character.
 * @author Brennan Cain (Brenn10)
 */
public class Hat extends CharacterDecorator {

    /**
     * Adds a hat to the character.
     * @param character the character to add the hat to.
     */
    public Hat(Character character) {
        super(character);
    }
    
    /**
     * Adds a hat to the character.
     */
    public void customize() {
        sections.set(1, " __|____|____");
    }
}
