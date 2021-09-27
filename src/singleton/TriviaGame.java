package singleton;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Runs the trivia game.
 * @author Brennan Cain (Brenn10)
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner scanner;
    private ArrayList<Question> questions;

    /**
     * Private constructor to prevent instantiation.
     */
    private TriviaGame() {
        rand = new Random();
        scanner = new Scanner(System.in);
        questions = DataLoader.getTriviaQuestions();
    }

    /**
     * Gets the instance of the TriviaGame.
     * @return TriviaGame instance.
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }

        return triviaGame;
    }

    /**
     * Plays the trivia game.
     */
    public void play() {
        String userInput = "p";
        while (!userInput.equalsIgnoreCase("q")) {
            if (userInput.equalsIgnoreCase("p")) {
                if (playRound()) {
                    score++;
                }
                System.out.print("(P)lay or (Q)uit: ");
            } else {
                System.out.println("Invalid input.\n(P)lay or (Q)uit: ");
            }
            userInput = scanner.nextLine();
        }
        System.out.println(String.format("\nYou won %d games!", score));
        System.out.println("Goodbye");

    }

    /**
     * Plays a round of the trivia game.
     * @return True if the user won, false otherwise.
     */
    private boolean playRound() {
        int questionNumber = rand.nextInt(questions.size());
        Question question = questions.get(questionNumber);
        System.out.println("\n" + question);
        System.out.print("Enter Answer: ");
        int answer = Integer.parseInt(scanner.nextLine());
        if (question.isCorrect(answer)) {
            System.out.println("YAY! You got it right!");
            return true;
        } else {
            System.out.println("The correct answer is " + question.getCorrectAnswer());
            return false;
        }
    }
}
