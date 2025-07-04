
import java.util.Scanner;

public class Hw2 {

    public static void main(Stringstd[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject1:");
        int a = sc.nextInt();
        System.out.println("Enter marks of subject2:");
        int b = sc.nextInt();
        System.out.println("Enter makrs of subject3:");
        int c = sc.nextInt();
        int sum = a + b + c;
        float cgpa = (sum) / 30;
        System.out.println("Your CGPA is:");
        System.out.println(cgpa + "%");
    }
}
