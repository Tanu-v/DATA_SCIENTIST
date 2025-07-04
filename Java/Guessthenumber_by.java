
import java.util.Random;
import java.util.Scanner;

class Game {

    public int number;
    public int inputnumber;
    public int noOfguesses;

    public int getNumberOfGuesses() {
        return noOfguesses;
    }

    public void incrementGuesses() {
        this.noOfguesses++;
    }

    Game() {
        Random rnd = new Random();
        this.number = rnd.nextInt(100); // Generates a number between 0-99
    }

    void takeUserInput() {
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        if (inputnumber == number) {
            System.out.println("Correct Guess!");
            return true;
        } else if (inputnumber > number) {
            System.out.println("Too high...");
        } else {
            System.out.println("Too low...");
        }
        return false;
    }
}

public class Guessthenumber_by {

    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;

        while (!b) {
            g.takeUserInput();
            g.incrementGuesses();
            b = g.isCorrectNumber();
        }

        System.out.println("You guessed the number in " + g.getNumberOfGuesses() + " attempts.");
    }
}
