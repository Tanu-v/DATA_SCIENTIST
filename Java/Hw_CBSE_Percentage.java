
import java.util.Scanner;

public class Hw_CBSE_Percentage {

    public static void main(Stringstd[] args) {
        System.out.println("Enter your marks subject wise to know your percentage:");
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter subject1 marks:");
        int sub1 = marks.nextInt();
        System.out.println("Enter marks of subject2");
        int sub2 = marks.nextInt();
        System.out.println("Enter marks of subject3");
        int sub3 = marks.nextInt();
        System.out.println("Enter marks of subject4");
        int sub4 = marks.nextInt();
        System.out.println("Enter marks of subject5");
        int sub5 = marks.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.print("The Total marks gain is:");
        System.out.println(total);
        // double a = total/500;
        double percentage = (total * 100) / 500;
        System.out.print("The percentage obtained is:");
        System.out.println(percentage + "%");

    }

}
