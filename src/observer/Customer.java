package observer;

import java.util.ArrayList;

/**
 * A customer which listens to updates from the subject.
 */
public class Customer implements Observer{
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * Creates a new customer with the given name and subscribes to the given subject.
     * @param subject the subject to subscribe to
     * @param firstName the first name of the customer
     * @param lastName the last name of the customer
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wishList = new ArrayList<Book>();

        this.subject.registerObserver(this);
    }
    
    /**
     * Adds a book to the wish list.
     * @param book the book to add
     */
    public void update(Book book) {
        wishList.add(book);
    }

    /**
     * Prints the wish list.
     */
    public void display() {
        System.out.println("Wish List:");
        for (Book book : wishList) {
            System.out.println(" - " + book);
        }
        System.out.println();
    }
}
