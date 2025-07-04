
import java.util.*;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(15);
        l2.add(24);
        l2.add(12);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(l2);   // add inlast
        l1.addAll(0, l2);  // add in first
        l1.set(1, 566);
        l1.addFirst(23);

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }
        // l1.clear();

        System.out.println(l1.contains(7));
        System.out.println(l1.contains(67));

        System.out.println(l1.indexOf(7));
        System.out.println(l1.indexOf(6));  // if the no is present in 2 or more times it gives the index of first one occuring
        System.out.println(l1.lastIndexOf(6)); // provide last index of the number 
        System.out.println(l1.indexOf(125));  // give -1 cause it does not exist in arraylist

    }

}
