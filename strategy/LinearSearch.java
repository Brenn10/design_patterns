package strategy;

import java.util.ArrayList;

/**
 * Provides a linear search behavior.
 */
public class LinearSearch implements SearchBehavior {
    
    /**
     * Sequentially check if the item matches any of the items in the list, ignoring case.
     * @param data The list of items to search.
     * @param item The item to search for.
     * @return True if the item is in the list, false otherwise.
     */
    public boolean contains(ArrayList<String> data, String item) {
        for (String s : data) {
            if (s.equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }
}
