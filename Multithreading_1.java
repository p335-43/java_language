public class Multithreading_1 {
    public static void main(String[] args) {

        Mythreadrunnable t = new Mythreadrunnable();
        Thread t1 = new Thread(t);
        Mythreadrunnable1 z = new Mythreadrunnable1();
        Thread t2 = new Thread(z);
        t1.start();
        t2.start();
        
    }
    
}

class Mythreadrunnable implements Runnable{
    public void run(){
        int i=0;
        while (i<200) {
            System.out.println("hello mister how are you?");
            i++;
            
        }
        
    }
}

class Mythreadrunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<200) {
            System.out.println("I am fine thank you ");
            i++;  
        }
        
    }
}


