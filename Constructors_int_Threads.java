public class Constructors_int_Threads {
    public static void main(String[] args) {

        Mythr t = new Mythr("pranjal");
        t.start();
        System.out.println(t.getId());
        System.out.println(t.getName());
        
    }
}

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<25) {
            System.out.println("i am a thread");
            
            i++;
        }
    }
}
