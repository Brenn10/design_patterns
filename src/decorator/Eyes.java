package decorator;

/**
 * Decorates the eyes of the character.
 * @author Brennan Cain (Brenn10)
 */
public class Eyes extends CharacterDecorator {

    /**
     * Adds eyes to the character.
     * @param character Character to decorate.
     */
    public Eyes(Character character) {
        super(character);
        customize();
    }
    
    /**
     * Adds eyes to the character.
     */
    public void customize() {
        character.sections.set(3, " |  o  o  | ");
    }
}
