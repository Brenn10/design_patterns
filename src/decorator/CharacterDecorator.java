package decorator;

/**
 * A decorator class for the Character class.
 * @author Brennan Cain (Brenn10)
 */
public abstract class CharacterDecorator extends Character {
    protected Character character;

    /**
     * Creates a CharacterDecorator object.
     * @param character the Character object to be decorated.
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        this.sections.addAll(character.sections);
    }

    /**
     * Customize the character.
     * I don't understand why this is needed in the public since customize should be a local helper
     * method.
     */
    public abstract void customize();
}
