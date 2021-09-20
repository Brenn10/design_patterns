package iterator;

/**
 * Flight class.
 * @author Brennan Cain (Brenn10)
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int tranfers;

    /**
     * Flight constructor.
     * @param flightNum Flight number.
     * @param from From airport.
     * @param to To airport.
     * @param duration Duration.
     * @param transfers Transfers.
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.tranfers = transfers;
    }

    /**
     * Get origin airport.
     * @return Origin airport.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Get destination airport.
     * @return Destination airport.
     */
    public String getTo() {
        return to;
    }

    /**
     * Get duration.
     * @return Duration.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Get transfers.
     * @return Transfers.
     */
    public int getNumTranfers() {
        return tranfers;
    }

    /**
     * Get flight number.
     * @return Flight number.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Flight Number: " + flightNum + "\n");
        sb.append("From: " + from + "\n");
        sb.append("To: " + to + "\n");
        sb.append("Duration: " + duration / 60 + " hours " + duration % 60 + " minutes\n");
        sb.append("Transfers: " + tranfers + "\n");
        return sb.toString();
    }
}
