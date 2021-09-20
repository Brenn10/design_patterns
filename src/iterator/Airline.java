package iterator;

import java.util.Iterator;

/**
 * A collection of flights.
 * @author Brennan Cain (Brenn10)
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size;

    /**
     * Creates the airline.
     * @param title The title of the airline.
     */
    public Airline(String title) {
        this.title = title;
        flights = new Flight[2];
        size = 0;
    }

    /**
     * Adds a flight to the airline.
     * @param flightNum The flight number.
     * @param from The departure airport.
     * @param to The arrival airport.
     * @param duration The duration of the flight.
     * @param transfers The number of transfers.
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight newFlight = new Flight(flightNum, from, to, duration, transfers);
        if (size == flights.length) {
            flights = growArray(flights);
        }
        flights[size++] = newFlight;
    }

    /**
     * Gets the title of the airline.
     * @return The title of the airline.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the flights of the airline.
     * @param flights The flights of the airline.
     * @return The flights of the airline.
     */
    private Flight[] growArray(Flight[] flights) {
        Flight[] newFlights = new Flight[flights.length * 2];
        for (int i = 0; i < flights.length; i++) {
            newFlights[i] = flights[i];
        }
        return newFlights;
    }

    /**
     * Gets an iterator for the flights of the airline.
     * @return The iterator for the flights of the airline.
     */
    public Iterator createIterator() {
        return new FlightIterator(flights);
    }
}
