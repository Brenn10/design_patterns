package strategy;

import java.util.ArrayList;

/**
 * Provides an interface for all search strategies.
 */
public interface SearchBehavior {

    /**
     * Check if the item matches any of the items in the list, ignoring case.
     * @param data The ArrayList to search in.
     * @param item The item to search for.
     * @return True if the item is found, false otherwise.
     */
    public boolean contains(ArrayList<String> data, String item);
}
