
public class Operators {

    public static void main(Stringstd[] args) {
        // ARITHMETIC OPERATORS
        int a = 4;
        int b = 6 * a;
        System.out.println(b);// Arithmatic operators can not work with boolean
        // % works with float and double
        int c = 6 % a;// modulo operator
        // 4.8%1.1 returns decimal Remainder
        System.out.println(c);
        // ASSIGNMENT OPERATORS
        int d = 9;
        d += 3;
        System.out.println(d);
        // COMPARISON OPERATORS
        System.out.println(6 == 8);
        System.out.println(6 == 6);
        System.out.println(64 > 6);
        // LOGICAL OPERATORS
        System.out.println(94 > 9 && 94 > 8);
        System.out.println(94 > 9 && 94 > 98);
        System.out.println(68 < 75 || 68 > 75);
        // BITWISE OPERATORS
        System.out.println(2 & 3);

    }

}
