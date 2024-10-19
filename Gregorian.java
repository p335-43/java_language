import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); 
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.HOUR)+" "+ c.get(Calendar.MINUTE));


        GregorianCalendar h = new GregorianCalendar();
        System.out.println(h.isLeapYear(2024));

        
        for(int i=0;i<100;i++){
        System.out.println(TimeZone.getAvailableIDs()[i]);}

    }
}
