package observer;

import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    
    public Store(Subject subject, String title){
        this.subject = subject;
        this.title = title;
        bestSellers = new LinkedList<Book>();
    }

    public void update(Book book) {
        bestSellers.add(book);
        if (bestSellers.size() > 5) {
            bestSellers.remove();
        }
    }

    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for (Book book : bestSellers) {
            System.out.println(" - " + book);
        }
    }
}
