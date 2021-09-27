package singleton;
/**
 * A driver for the Trivia Game.
 */
public class GameDriver {
   
    /**
     * Runs the trivia game.
     */
    public void run(){
        TriviaGame game = TriviaGame.getInstance();
        game.play();
    }

    /**
     * The main method.
     * @param args the command-line arguments.
     */
    public static void main(String[] args){
        GameDriver driver = new GameDriver();
        driver.run();
    }
}
