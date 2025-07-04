
import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for rock , 1 for paper and 2 for scissor!");

        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        if (computerinput == userinput) {
            System.out.println("Draw");

        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
            System.out.println("Congratulations!!!! \n You win!.......");
        } else {
            System.out.println("Computer win! \n Sorry! try again....");
        }
        System.out.println("Computers choice: " + computerinput);

        if (computerinput == 0) {
            System.out.println("The computer's choice is :Rock!");
        } else if (computerinput == 1) {
            System.out.println("The computer's choice is : paper!");
        } else {
            System.out.println("The computer's choice is : Scissor!");
        }

    }

}
