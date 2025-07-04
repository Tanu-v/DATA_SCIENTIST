
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(df1);

        System.out.println(df);
        String myDate = dt.format(df);
        System.out.println(myDate);
    }

}
