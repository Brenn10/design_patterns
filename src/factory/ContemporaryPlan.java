package factory;

/**
 * A plan for a contemporary home.
 * @author Brennan Cain (Brenn10)
 */
public class ContemporaryPlan extends HousePlan{

    /**
     * Contructs a plan for a contemporary home.
     */
    public ContemporaryPlan() {
        super(5, 40, 3000);
    }

    /**
     * Adds contemporary materials to the house.
     */
    @Override
    protected void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    /**
     * Adds contemporary features to the house.
     */
    @Override
    protected void setFeatures() {
        features.add("Oversizex Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plans");
    }

    /**
     * Returns the name and information of the plan.
     * @return The name and information of the plan.
     */
    public String toString() {
        return "Contemporary\n" + super.toString();
    }
}
