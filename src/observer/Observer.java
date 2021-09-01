package observer;

/**
 * The observer interface.
 */
public interface Observer {
    /**
     * Update the observer.
     * @param book the book to update the observer with.
     */
    public void update(Book book);

    /**
     * Display the observer.
     */
    public void display();
}
