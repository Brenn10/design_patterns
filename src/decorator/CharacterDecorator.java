package decorator;

/**
 * A decorator class for the Character class.
 * @author Brennan Cain (Brenn10)
 */
public abstract class CharacterDecorator extends Character {
    protected Character character;

    /**
     * Creates a CharacterDecorator object.
     * I don't know why we save character in the constructor, but it's there.
     * Seems like it is unused.
     * @param character the Character object to be decorated.
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        this.sections.addAll(character.sections);
        customize();
    }

    /**
     * Customize the character.
     */
    public abstract void customize();
}
