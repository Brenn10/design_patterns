package iterator;

import java.util.Iterator;

/**
 * Iterator for flights.
 * @author Brenn10
 */
public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position = 0;

    /**
     * Constructor for FlightIterator.
     * @param flights The array of flights.
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    /**
     * Returns true if there are more flights.
     * @return True if there are more flights.
     */
    public boolean hasNext() {
        if (position >= flights.length || flights[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns the next flight.
     * @return The next flight.
     */
    public Flight next() {
        Flight flight = flights[position];
        position++;
        return flight;
    }
}
