package singleton;

/**
 * Holds questions with their answers.
 * @author Brennan Cain (Brenn10)
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * Create a question and answer pair.
     * @param question The question.
     * @param ans1 The first answer.
     * @param ans2 The second answer.
     * @param ans3 The third answer.
     * @param ans4 The fourth answer.
     * @param correctAnswer The correct answer.
     */
    public Question(String question,
                    String ans1,
                    String ans2,
                    String ans3,
                    String ans4,
                    int correctAnswer) {
        this.question = question;
        this.answers = new String[4];
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Give the question and answers as a string.
     * @return The question with answers.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(question + "\n");
        for (int i = 0; i < answers.length; i++) {
            sb.append(" " + (i + 1) + ". " + answers[i] + "\n");
        }
        return sb.toString();
    }

    /**
     * Check if the user answer is correct.
     * @param userAnswer The user's answer.
     * @return True if the user answer is correct.
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer - 1 == correctAnswer;
    }

    /**
     * Get the correct answer.
     * @return The correct answer.
     */
    public String getCorrectAnswer() {
        return answers[correctAnswer];
    }
}
