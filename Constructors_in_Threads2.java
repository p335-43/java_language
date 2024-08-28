public class Constructors_in_Threads2 {
    public static void main(String[] args) {
        Fut tuh = new Fut();
        Thread th = new Thread(tuh,"Mrinal");
        th.start();
        System.out.println(th.getName());
        System.out.println(th.getId());
        
    }
}

class Fut implements Runnable{
    // public Fut(String name){
    //     super(name);
    // }

    public void run(){
        int i=0;
        while (i<30) {
            System.out.println("i am  the constructors in runnable method ");
            i++;
        }
    }
}
