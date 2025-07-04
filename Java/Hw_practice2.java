
public class Hw_practice2 {

    public static void main(String[] args) {
        // question 1
        // float[] marks = {47.6f, 24.8f, 50.6f, 76.9f, 50.8f};
        // float sum = 0;
        // for (float element : marks) {
        //     sum = sum + element;
        // }
        // System.out.println("The value of sum is: " + sum);

        // question 2
        /*   float[] marks = {47.6f, 24.8f, 50.6f, 76.9f, 50.8f};
        float num = 47.6f;
        boolean Isinarray = false;
        for (float element : marks) {
            if (num == element) {
                Isinarray = true;
                break;
            }
        }
        if (Isinarray) {
            System.out.println("The value is in the array!");
        } else {
            System.out.println("The value is not in the array!");
        }  */
        // question 3
        // float[] marks = {47.6f, 24.8f, 50.6f, 76.9f, 50.8f};
        // float sum = 0;
        // for (float element : marks) {
        //     sum = sum + element;
        // }
        // System.out.println("The value of Average is: " + sum / marks.length);
        // Problem 4
        // int[] a = {1, 2, 3, 4};
        // for (int i = a.length - 1; i > -1; i--) {
        //     System.out.println("Reverse Number is = " + a[i]);
        // }
        // problem 5 
        /*   int[] arr = {1, 2100, 24, 99, 455};
        int max = 0;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("The max number of this array is:" + max);

        // problem 6
        int min = 2100;
        for (int a : arr) {
            if (a < min) {
                min = a;
            }
        }
        System.out.println("The minimun number of this array is:" + min);
         */
        // problem 7
        // int[] arr = {1, 4, 7, 14, 67, 98};
        int[] arr = {1, 67, 3, 56, 29, 100};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted!");
        } else {
            System.out.println("The array is not sorted!");
        }

    }

}
