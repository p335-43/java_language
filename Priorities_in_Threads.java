public class Priorities_in_Threads {
    public static void main(String[] args) {
        Mythr5 t1 = new Mythr5("p1");
        Mythr5 t2 = new Mythr5("p2");
        Mythr5 t3 = new Mythr5("p3");
        Mythr5 t4 = new Mythr5("p4");
        Mythr5 t5 = new Mythr5("p5 this is the most important thread ");

        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}

class Mythr5 extends Thread{
    public Mythr5(String name){
        super(name);
    }
    public void run(){
        int i=0;
        // System.out.println("thank you " + this.getName());
        while (i<25) {
            // System.out.println("i am a thread");
            System.out.println("thank you " + this.getName());
            
            i++;
        }
    }
}
