package factory;

/**
 * Creates a log cabin plan.
 */
public class LogCabinPlan extends HousePlan{

    /**
     * Creates a log cabin plan.
     */
    public LogCabinPlan() {
        super(2, 10, 1800);
    }

    /**
     * Sets the materials for the log cabin plan.
     */
    @Override
    protected void setMaterials() {
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    /**
     * Sets the features for the log cabin plan.
     */
    @Override
    protected void setFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    /**
     * Prints the name and information on the log cabin plan.
     * @return The name and information on the log cabin plan.
     */
    public String toString() {
        return "Log Cabin\n" + super.toString();
    }
}
