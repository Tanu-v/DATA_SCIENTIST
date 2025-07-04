
public class Arrays {

    public static void main(String[] args) {
        // int[] marks = new int[5];  declaration and memory allocation
        int[] marks; // declaration
        marks = new int[5]; // memory allocation
        // initialization below
        marks[0] = 88;
        marks[1] = 100;
        marks[2] = 86;
        marks[3] = 78;
        marks[4] = 96;
        marks[4] = 99; // override
        marks[5] = 67; // error 
        System.out.println(marks[4]);

        // declaration , memory allocation, and initialization together
        int[] mark = {100, 60, 78, 99, 23, 45, 67, 98, 56};
        System.out.println(mark[7]);
    }

}
