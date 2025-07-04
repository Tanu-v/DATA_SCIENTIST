
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class ps15 {

    public static void main(String[] args) {

        // problem 1
        ArrayList ar = new ArrayList();
        ar.add("student 1");
        ar.add("student 2");
        ar.add("student 3");
        ar.add("student 4");
        ar.add("student 5");
        ar.add("student 6");
        ar.add("student 7");
        ar.add("student 8");
        ar.add("student 9");
        ar.add("student 10");
        ar.add("student 11");
        ar.add("student 12");
        for (Object o : ar) {
            System.out.println(o);
        }
        // problem 2
        HashSet<Integer> h = new HashSet<>();
        h.add(5);
        h.add(6);
        h.add(45);
        h.add(3);
        h.add(10);
        h.add(6);
        System.out.println(h);

        //  problem 3
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        //  problem 4
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        // problem 5
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String md = dt.format(df);
        System.out.println(md);

    }

}
