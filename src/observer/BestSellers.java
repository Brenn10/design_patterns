package observer;

import java.util.ArrayList;

/**
 * The BestSellers class notifies observers when a new book is added to the bestsellers list.
 */
public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Instantiates the observers and bestsellers ArrayLists.
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    /**
     * Adds an observer to the observers ArrayList.
     * @param observer The observer to be added.
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the observers ArrayList.
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all observers of the change.
     * @param book The book that was added to the bestsellers list.
     */
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    /**
     * Add a book to the bestsellers list and notify all observers of the change.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObservers(book);
    }
}
