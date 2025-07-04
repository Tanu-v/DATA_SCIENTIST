
import java.util.HashSet;

public class set_hashset {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(6, 0.5f);
        hs.add(6);
        hs.add(15);
        hs.add(3);
        hs.add(11);
        hs.add(11);
        System.out.println(hs);
    }

}
