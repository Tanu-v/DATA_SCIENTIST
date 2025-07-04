
public class Method_overloading {

    static void foo() {
        System.out.println("Good Morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good Morning" + a + " Bro!");
    }

    static void foo(int a, int b) {
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void telljokes() {
        System.out.println("I made the world!\n"
                + "Me");
    }

    public static void main(String[] args) {
        // telljokes();

        // Case 1: Changing the integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is:" + x);

        // Case 2 : Changing the array
        int[] arr = {10, 12, 34, 67, 68};
        change2(arr);
        System.out.println("the value after using change2:" + arr[0]);

        // Method overloading
        foo();
        foo(3000);
        foo(3000, 4000);
    }
}
