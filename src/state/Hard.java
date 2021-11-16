package state;

import java.util.Random;

/**
 * Hard State.
 * @author Brennan Cain (Brenn10)
 */
public class Hard implements State {
    private ArithmeticGame game;
    private Random rand;
    private String[] operators = {"+", "-", "*", "/"};

    /**
     * Constructor.
     * @param game instance of the game
     */
    public Hard(ArithmeticGame game) {
        this.game = game;
        rand = new Random();
    }

    /**
     * Get a number.
     * @return a number between 1 and 100
     */
    public int getNum() {
        return rand.nextInt(100) + 1;
    }

    /**
     * Get an operator.
     * @return an operator in +,-,*,/
     */
    public String getOperator() {
        return operators[rand.nextInt(4)];
    }

    /**
     * Nice.
     */
    public void levelUp() {
        System.out.println("You've been advanced to hardest mode.");
    }

    /**
     * Level down to medium.
     */
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You are struggling, let's go to medium mode.");
    }
    
}
