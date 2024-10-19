import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter g = DateTimeFormatter.ofPattern("MM-dd-yyyy -- E h:m a" );

        DateTimeFormatter h= DateTimeFormatter.ISO_LOCAL_DATE;



        String mydate = dt.format(g);
        System.out.println(mydate);
    }
}
