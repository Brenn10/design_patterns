package observer;
/**
 * An object that represents a book.
 */
public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * Create a new book.
     * @param title the title of the book
     * @param authorFirstName the first name of the author
     * @param authorLastName the last name of the author
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    /**
     * Get the title of the book.
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the first name of the author.
     * @return the first name of the author
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Get the last name of the author.
     * @return the last name of the author
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Print the book details.
     * Formatted as: "{title} by: {authorFirstName} {authorLastName}".
     */
    @Override
    public String toString() {
        return title + " by: " + authorFirstName + " " + authorLastName;
    }
}
