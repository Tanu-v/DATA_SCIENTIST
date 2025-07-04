
import java.util.Calendar;
import java.util.TimeZone;

public class calander_class {

    public static void main(String[] args) {
        // Calendar cd = Calendar.getInstance();
        // System.out.println(cd.getTimeZone());
        // System.out.println(cd.getCalendarType());

        Calendar cd = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cd.getTimeZone().getID());
        System.out.println(cd.getCalendarType());

    }

}
