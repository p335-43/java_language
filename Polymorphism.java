public class Polymorphism {
    public static void main(String[] args) {

        Camera c = new Smartphone();
        c.record();
        // c.pickcall(); this is called restricting the method implementation by an interface 
        
    }
}


interface Camera {
    void takesnap();
    void record();
    default void record4k(){
        parts();
        System.out.println("record in 4k");
    }


    private void parts(){
        System.out.println("button, lens and charger");
    }

}

/**
 * Wifi
 */
interface Wifi {

    String[] getnetwork();
    void connecttonetwork(String network);
}

class Mycellphone{
    void pickcall(){
        System.out.println("connecting....");
    }

    void callNumber(long number){
        System.out.println("calling "+ number);
    }
}


class Smartphone extends Mycellphone implements Wifi, Camera{
    public void takesnap(){
        System.out.println("click to capture the photo");
    }

    public void record(){
        System.out.println("click to start recording");
    }

    public  String[] getnetwork(){
        System.out.println("list of networks");
        String[] networks={"airtel","jio","vi"};
        return networks;
    }

    public void connecttonetwork(String network){
        System.out.println("connecting to "+ network);
    }



}

