import java.util.Date;

public class thedateclass {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        // d.getTime();
        System.out.println(d.getTime());
        System.out.println(d.getMinutes());
        System.out.println(d.getMonth());
        System.out.println(d.getTimezoneOffset());
        System.out.println(d.getYear());
    }
}
