

public class Multithreading {
   public static void main(String[] args) {
    Mythread1 t1 = new Mythread1();
    Mythread2  t2 = new Mythread2();
    t1.start();
    t2.start();
    
   } 
}

class Mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<2000) {
        System.out.println("my thread is running ");
        System.out.println("i am happy");
        i++;
        }
        
    }
}

class Mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<2000) {
        System.out.println("my thread2 is running ");
        System.out.println("i am sad");
        i++;
        }
        
    }
}
