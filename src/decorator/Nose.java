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
        customize();
    }
    
    /**
     * Customizes the nose.
     */
    public void customize() {
        character.sections.set(4, " |   >    | ");
    }
}
