
import java.util.Scanner;

public class Hw4MileTOkmconvertor {

    public static void main(Stringstd[] args) {
        System.out.println("Kilometers to Miles convertor!");
        System.out.println(" Please enter km to be convert:");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        double miles = km / 1.609344;
        System.out.println(km + "km is ");
        System.out.println(miles + "mi in miles!");

    }

}
