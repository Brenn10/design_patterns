package decorator;

/**
 * Adds a mouth to the character.
 * @author Brennan Cain (Brenn10)
 */
public class Mouth extends CharacterDecorator {

    /**
     * Creates a mouth.
     * @param character the character to decorate.
     */
    public Mouth(Character character) {
        super(character);
        customize();
    }
    
    /**
     * Customizes the mouth.
     */
    public void customize() {
        character.sections.set(5, "  \\ ---- / ");
    }
}
