package state;

/**
 * State interface.
 * @author Brennan Cain (Brenn10)
 */
public interface State {
    /**
     * Get a number.
     * @return a number in a range
     */
    public int getNum();

    /**
     * Get an operator.
     * @return an operator as a string
     */
    public String getOperator();

    /**
     * Level up to a harder level.
     */
    public void levelUp();

    /**
     * Level down to an easier level.
     */
    public void levelDown();
}
