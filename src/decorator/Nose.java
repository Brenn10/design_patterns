package decorator;

/**
 * Adds a nose to the character.
 * @author Brennan Cain (Brenn10)
 */
public class Nose extends CharacterDecorator {

    /**
     * Customizes the nose.
     * @param character The character to decorate with a nose.
     */
    public Nose(Character character) {
        super(character);
    }
    
    /**
     * Customizes the nose.
     */
    public void customize() {
        sections.set(4, " |   >    | ");
    }
}
