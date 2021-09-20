package iterator;

import java.util.Iterator;

/**
 * This class is the driver for the Airline class.
 * @author portiaportia
 */
public class AirlineDriver {
   
    /**
     * This method is the driver for the Airline class.
     */
    public AirlineDriver(){
        Airline american = new Airline("American Airlines");
        american.addFlight("477B", "Charlotte", "Seattle", 860, 1);
        american.addFlight("877F", "Florida", "NY", 400, 1);
        american.addFlight("673G", "Chicago", "Texas", 1250, 2);
        american.addFlight("773C", "NY", "Charlotte", 120, 0);
        american.addFlight("233B", "Atlanta", "Seattle", 960, 1);

        Iterator flights = american.createIterator();

        while (flights.hasNext()){
            System.out.println(flights.next() + "\n");
        }
    }

    /**
     * This method is the main method.
     * @param args Command line arguments.
     */
    public static void main(String[] args){
        AirlineDriver driver = new AirlineDriver();
    }
}
