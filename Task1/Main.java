// GUESS THE NUMBER GAME
package task1;

public class Main {
    public static void main(String[] args) {
        
        Game game = new Game(1, 100); 
        Score score = new Score();
        DialogUtils dialogUtils = new DialogUtils();

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = game.newGame(); // Start a new game

            int attempts = 0;
            boolean guessedCorrectly = false;
            while (!guessedCorrectly) {
                int guessedNumber = dialogUtils.promptForNumber("Guess a number between 1 and 100:");

                // Check the guessed number
                if (guessedNumber == targetNumber) {
                    dialogUtils.showMessage("Congratulations! You guessed the correct number.");
                    score.incrementScore();
                    guessedCorrectly = true;
                } else if (guessedNumber < targetNumber) {
                    dialogUtils.showMessage("The number is higher.");
                } else {
                    dialogUtils.showMessage("The number is lower.");
                }

                attempts++;

if (attempts >= 10) { // Adjust the number of attempts allowed
                    dialogUtils.showMessage("You've reached the maximum number of attempts. The number was: " +   targetNumber);
                    break;
                }
            }

            // Ask if the user wants to play again
            playAgain = dialogUtils.promptForYesNo("Do you want to play again?");
        }

        // Display final score
        dialogUtils.showMessage("Your final score is: " + score.getScore());
        dialogUtils.showMessage("Thanks for playing!");
    }
}

