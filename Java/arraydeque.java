
import java.util.ArrayDeque;

public class arraydeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(6);
        ad.add(66);
        ad.add(9);
        ad.addFirst(5);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
    }

}
