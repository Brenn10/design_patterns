package observer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A store which listens for updates from a subject.
 */
public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    
    /**
     * Constructs a store.
     * @param subject the subject to listen to
    */
    public Store(Subject subject){
        this.subject = subject;
        this.title = "";
        bestSellers = new LinkedList<Book>();
        
        this.subject.registerObserver(this);
    }

    /**
     * Update the store with the new book.
     */
    public void update(Book book) {
        bestSellers.add(book);
        if (bestSellers.size() > 5) {
            bestSellers.remove();
        }
    }

    /**
     * Display the store's best sellers.
     */
    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for (Book book : bestSellers) {
            System.out.println(" - " + book);
        }
        System.out.println();
    }
}
