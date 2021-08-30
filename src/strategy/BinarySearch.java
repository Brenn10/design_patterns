package strategy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class that implements the Binary Search algorithm.
 */
public class BinarySearch implements SearchBehavior {

    /**
     * Sort and binary search if the item matches any of the items in the list, ignoring case.
     * @param data The list of items to search.
     * @param item The item to search for.
     * @return True if the item is in the list, false otherwise.
     */
    public boolean contains(ArrayList<String> data, String item) {
        Collections.sort(data);
        int low = 0;
        int high = data.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int diff = item.compareToIgnoreCase(data.get(mid));

            if (diff == 0) { // this is our item
                return true;
            } else if (diff < 0) { // lower in the list
                high = mid - 1;
            } else { // higher in the list
                low = mid + 1;
            }
        }
        return false;
    }
}
