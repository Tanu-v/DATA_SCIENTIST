
public class Method_practices {
    // problem 1

    // static void multiplication(int n) {
    //     for (int i = 1; i <= 10; i++) {
    //         System.out.format("%d X %d = %d\n", n, i, n * i);
    //     }
    // }
    // public static void main(String[] args) {
    //     multiplication(7);
    // }
    // problem 2
    // static void pattern1(int n) {
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < i + 1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern1(9);
    // }
    // problem 3
    // static int sumRec(int n) {
    //     // Base condition
    //     if (n == 1) {
    //         return 1;
    //     }
    //     return n + sumRec(n - 1);
    // }
    // public static void main(String[] args) {
    //     int c = sumRec(4);
    //     int c1 = sumRec(9);
    //     System.out.println(c1);
    //     System.out.println(c);
    // }
    // problem 4
    // static void pattern2(int n) {
    //     for (int i = n; i > 0; i--) {
    //         for (int j = 0; j < i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern2(10);
    // }
    // problem 5
    // static int fib(int n) {
    //     /*   if (n == 1) {
    //         return 0;
    //     } else if (n == 2) {
    //         return 1;
    // }*/
    //     if (n == 1 || n == 2) {
    //         return n - 1;
    //     } else {
    //         return fib(n - 1) + fib(n - 2);
    //     }
    // }
    // public static void main(String[] args) {
    //     // fabunacci series=0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    //     int f = fib(7);
    //     System.out.println(f);
    // }
    // problem 6
    static void pattern1_rec(int n) {

        if (n > 0) {
            pattern1_rec(n - 1);

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1_rec(7);
    }

}
