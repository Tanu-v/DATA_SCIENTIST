// import java.util.Scanner;

// public class GuesstheNumber_game {
// public static void main(String[] args) {
import java.util.Random;
import java.util.Scanner;

class Game {

    public int ComputerInput, UserGuess, no_of_guess = 0;

    // Constructor to generate random number
    public Game() {
        Random random = new Random();
        ComputerInput = random.nextInt(11); // 0 to 10 inclusive
    }

    // Method to take guess from user
    public void UserInput(int num) {
        UserGuess = num;
    }

    // Method to check whether user's guess is correct
    public boolean IsCorrectNumber() {
        no_of_guess++;  // Increment first to simplify logic
        if (UserGuess > ComputerInput) {
            System.out.println("You have chosen a bigger number.");
            return false;
        } else if (UserGuess < ComputerInput) {
            System.out.println("You have chosen a smaller number.");
            return false;
        } else {
            System.out.println("Your guess is correct!");
            System.out.println("Number of guesses: " + no_of_guess);
            return true;
        }
    }
}

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO GUESS THE NUMBER GAME!");

        Game player = new Game();

        System.out.println("Guess the number between 0 and 10:");
        player.UserInput(sc.nextInt());

        while (!player.IsCorrectNumber()) {
            System.out.println("Try again. Guess the number:");
            player.UserInput(sc.nextInt());
        }

        sc.close(); // Good practice to close Scanner
    }
}

// }
    
// }
