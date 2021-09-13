package factory;

/**
 * Factory to create house plans.
 */
public class HousePlanFactory {

    /**
     * Create a house plan.
     * @param housePlanType the style of the house plan.
     * @return the house plan.
     */
    public static HousePlan createHousePlan(String housePlanType){
        String lowerCaseHousePlanType = housePlanType.toLowerCase();
        if (lowerCaseHousePlanType.contains("log")) {
            return new LogCabinPlan();
        } else if (lowerCaseHousePlanType.contains("tiny")) {
            return new TinyHomePlan();
        } else if (lowerCaseHousePlanType.contains("contemporary")) {
            return new ContemporaryPlan();
        } else {
            return null;
        }
    }
}
