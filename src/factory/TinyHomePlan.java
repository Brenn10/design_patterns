package factory;

/**
 * A tiny home plan.
 */
public class TinyHomePlan extends HousePlan{

    /**
     * Creates a tiny home plan.
     */
    public TinyHomePlan() {
        super(1, 5, 200);
    }

    /**
     * Set the materials for the tiny home plan.
     */
    @Override
    protected void setMaterials() {
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }

    /**
     * Set the features for the tiny home plan.
     */
    @Override
    protected void setFeatures() {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose areas");
        features.add("Multi-use applications");
    }

    /**
     * Returns the name and informations of the tiny home plan.
     * @return the name and informations of the tiny home plan.
     */
    public String toString() {
        return "Tiny Home\n" + super.toString();
    }
}
