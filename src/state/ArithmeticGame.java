package state;

import java.util.Scanner;

/**
 * ArithmeticGame.
 * @author Brennan Cain (Brenn10)
 */
public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * Constructor.
     */
    public ArithmeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
        reader = new Scanner(System.in);
    }

    /**
     * Run a question.
     */
    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        String operator = state.getOperator();
        System.out.println("What is " + num1 + " " + operator + " " + num2 + "?");
        int answer = reader.nextInt();
        int correctAnswer = 0;
        switch(operator) {
            case "+":
                correctAnswer = num1 + num2;
                break;
            case "-":
                correctAnswer = num1 - num2;
                break;
            case "*":
                correctAnswer = num1 * num2;
                break;
            case "/":
                correctAnswer = num1 / num2;
                break;
        }

        if (answer == correctAnswer) {
            System.out.println("Correct!");
            score++;
            if (score >= 3) {
                state.levelUp();
                score = 0;
            }
        } else {
            System.out.println("Incorrect!");
            score--;
            if (score <= -3) {
                state.levelDown();
                score = 0;
            }
        }

    }

    /**
     * Set state.
     * @param state state to set
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Get easy state.
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * Get medium state.
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * Get hard state.
     */
    public State getHardState() {
        return hardState;
    }
}
