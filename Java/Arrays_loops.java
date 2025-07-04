
public class Arrays_loops {

    public static void main(String[] args) {
        int[] marks = {100, 78, 99, 89, 75};
        // float[] marks = {100, 78, 99, 89, 75};
        System.out.println(marks[4]);
        String[] students = {"Ram", "Siyu", "Tanu", "Priya", "Preet"};
        System.out.println(students.length);
        // printing using naive way!
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        // priting using for loop!
        System.out.println("Displaying array in loop!");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // priting using for loop in reverse order
        System.out.println("displaying array using for loop in reverse order!");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);

        }
        // Quick Quize = printing using (for each loop)
        System.out.println("Printing using for each loop!");
        for (int element : marks) {
            System.out.println(element);
        }
    }

}
