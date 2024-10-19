import java.util.Calendar;
import java.util.TimeZone;

public class Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Calendar d = Calendar.getInstance();
        d.add(Calendar.DATE, 3);
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.compareTo(d));


        Calendar f = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(f.getTimeZone().getID());
        System.out.println(f.compareTo(c));

        System.out.println(c.getTime());
        System.out.println(f.getTime());
        System.out.println(c.get(Calendar.YEAR));
    }
}
