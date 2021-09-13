package factory;

import java.util.ArrayList;

/**
 * Provides information for a house plan.
 */
public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;

    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * Creates a new HousePlan object.
     * @param numRooms the number of rooms in the house
     * @param numWindows the number of windows in the house
     * @param squareFeet the square feet of the house
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        materials = new ArrayList<>();
        features = new ArrayList<>();
        setMaterials();
        setFeatures();
    }

    /**
     * Implemented by subclasses to set the materials.
     */
    protected abstract void setMaterials();

    /**
     * Implemented by subclasses to set the features.
     */
    protected abstract void setFeatures();

    /**
     * Returns the materials for this house plan.
     * @return List of materials.
     */
    public ArrayList<String> getMaterials() {
        return materials;
    }

    /**
     * Returns the features for this house plan.
     * @return List of features.
     */
    public ArrayList<String> getFeatures() {
        return features;
    }

    /**
     * Returns the number of rooms for this house plan.
     * @return Number of rooms.
     */
    public int getNumRooms() {
        return numRooms;
    }

    /**
     * Returns the number of windows for this house plan.
     * @return Number of windows.
     */
    public int getNumWindows() {
        return numWindows;
    }

    /**
     * Returns the square feet for this house plan.
     * @return Square feet.
     */
    public int getSquareFeet() {
        return squareFeet;
    }

    /**
     * Returns a string representation of this house plan.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Square Feet: " + squareFeet + "\n");
        sb.append("Room: " + numRooms + "\n");
        sb.append("Windows: " + numWindows + "\n");
        sb.append("\nMaterials:\n");
        for (String s : materials) {
            sb.append(" - " + s + "\n");
        }
        sb.append("\nFeatures:\n");
        for (String s : features) {
            sb.append(" - " + s + "\n");
        }
        return sb.toString();
    }
}
