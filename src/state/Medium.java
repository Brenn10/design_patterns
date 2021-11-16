package state;

import java.util.Random;

/**
 * Medium State.
 * @author Brennan Cain (Brenn10)
 */
public class Medium implements State {
    private ArithmeticGame game;
    private Random rand;
    private String[] operators = {"+", "-", "*"};

    /**
     * Constructor.
     * @param game instance of the game
     */
    public Medium(ArithmeticGame game) {
        this.game = game;
        rand = new Random();
    }

    /**
     * Get a number.
     * @return a number between 1 and 50
     */
    public int getNum() {
        return rand.nextInt(50) + 1;
    }

    /**
     * Get an operator.
     * @return an operator in +,-,*
     */
    public String getOperator() {
        return operators[rand.nextInt(3)];
    }

    /**
     * Level up to hard.
     */
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You've been advanced to hardest mode.");
    }

    /**
     * Level down to easy.
     */
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You are struggling, let's go to easy mode.");
    }
}
