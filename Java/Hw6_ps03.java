
import java.util.Scanner;

public class Hw6_ps03 {

    public static void main(Stringstd[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        int a = sc.nextInt();               // Read an integer input
        System.out.println(a > 8);          // Print if 'a' is greater than 8
        sc.close();                         // Close the scanner to avoid resource leak
    }
}
