package observer;

/**
 * The Subject interface.
 */
public interface Subject {
    /**
     * Attach an observer.
     * @param observer the observer to attach.
     */
    public void registerObserver(Observer observer);

    /**
     * Remove an observer.
     * @param observer the observer to remove.
     */
    public void removeObserver(Observer observer);

    /**
     * Notify all observers.
     * @param book the book to pass to the observers.
     */
    public void notifyObservers(Book book);
}
