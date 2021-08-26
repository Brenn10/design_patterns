package strategy;

import java.util.ArrayList;

/**
 * Provides a container for a list of guests.
 */
public class GuestList {
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    /**
     * Creates a new GuestList with the given title and defaults to the LinearSearch behavior.
     * @param title title of the list.
     */
    public GuestList(String title) {
        this.title = title;
        people = new ArrayList<String>();
        searchBehavior = new LinearSearch();
    }

    /**
     * Add a person to the list, if not already on the list.
     * @param person Person to add to the list.
     * @return true if the person was added, false if the person was already on the list.
     */
    public boolean add(String person) {
        if (searchBehavior.contains(people, person)) {
            return false;
        }
        people.add(person);
        return true;
    }

    /**
     * Remove a person from the list, if on the list.
     * @param person Person to remove from the list.
     * @return true if the person was removed, false if the person was not on the list.
     */
    public boolean remove(String person) {
        if (!searchBehavior.contains(people, person)) {
            return false;
        }
        people.remove(person);
        return true;
    }

    /**
     * Get the title of the list.
     * @return the title of the list.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the search behavior of the list.
     * @param searchBehavior the search behavior to set.
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    /**
     * Get the current guest list.
     * @return the current guest list.
     */
    public ArrayList<String> getList() {
        return people;
    }
}
