/**
 * Java_thread_methods
 */
public class Java_thread_methods {

    public static void main(String[] args) {
        Myt t = new Myt();
        Myt1 t1 = new Myt1();
        t.start();
        // try{
        //     t.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        
        t1.start();
        
    }
}

class Myt extends Thread{
  
    public void run(){
        int i=0;
        while (true) {
            System.out.println("i am a thread");

            try{
                Thread.sleep(6000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            
            // i++;
        }
    }
}

class Myt1 extends Thread{
   
    public void run(){
        int i=0;
        while (i<25) {
            System.out.println("hello thank you ");
            
            i++;
        }
    }
}
