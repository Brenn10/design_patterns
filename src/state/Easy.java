package state;

import java.util.Random;

/**
 * Easy state.
 * @author Brennan Cain (Brenn10)
 */
public class Easy implements State{
    private ArithmeticGame game;
    private Random rand;
    private String[] operators = {"+", "-"};
    
    /**
     * Constructor.
     * @param game game instance
    */
    public Easy(ArithmeticGame game) {
        this.game = game;
        rand = new Random();
    }

    /**
     * Get number.
     * @return number between 1 and 10
     */
    public int getNum() {
        return rand.nextInt(9) + 1;
    }

    /**
     * Get operator.
     * @return operator in +,-
     */
    public String getOperator() {
        return operators[rand.nextInt(2)];
    }

    /**
     * Level up to medium.
     */
    public void levelUp() {
        game.setState(game.getMediumState());
        System.out.println("You've been advanced to medium mode.");
    }

    /**
     * Ooof.
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
