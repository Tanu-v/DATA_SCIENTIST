
import java.util.Scanner;

public class Hw8_ps_if_else_switch {

    public static void main(String[] args) {
        // question1 
        /*   int a = 10;
        if (a = 11) { // will give an error , correction (a==11)
              System.out.println("I am 11!");
        }
        else{
            System.out.println("I am not 11!");
        }
         */
        // question 2
        /*  byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Mathematics");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("Your overall percentage is:" + avg);
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations! You are promoted!");
        } else {
            System.out.println("Sorry! You are not promoted!, Please try again!");
        }
         */

        // question 3
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per anum:");
        float tax = 0;
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5 && income <= 5.0f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5.0f && income <= 10.0f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);

        }
        System.out.println("The total tax paid by the employee is:" + tax);
         */
        // question4 
        Scanner sc = new Scanner(System.in);
        /*  int day = sc.nextInt();

        switch (day) {
            case 1 ->
                System.out.println("Monday");
            case 2 ->
                System.out.println("Tueday");
            case 3 ->
                System.out.println("Wednessday");
            case 4 ->
                System.out.println("Thursday");
            case 5 ->
                System.out.println("Friday");
            case 6 ->
                System.out.println("Satday");
            case 7 ->
                System.out.println("Sunday");
        }
         */

        // question 6 
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organisational website!");
        }
        if (website.endsWith(".com")) {
            System.out.println("This is an Comertial website!");
        }
        if (website.endsWith(".in")) {
            System.out.println("This is an Indian website!");
        }

    }

}
