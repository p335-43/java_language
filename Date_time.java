public class Date_time {
    public static void main(String[] args) {
        
        System.out.println(System.currentTimeMillis()/1000/24/60/60/365); // no of years have passed since 1970 
        System.out.println(System.currentTimeMillis()/1000/60/60); // no of hours have passed since 1970 
        long d = System.currentTimeMillis();
        System.out.println(d); 

    }
}
