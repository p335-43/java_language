public class Methodoverriding {
    public static void main(String[] args) {

        // One n = new One();
        // n.pt();

        Tow h = new Tow();
        h.pt();
        
    }
}

class One{
    int a;
    int k(){
        return 4;
    }

    public void pt(){
        System.out.println("hello duniya");
    }
}

class Tow extends One{
    
    public Tow(){
        System.out.println("hi! there i am extended class constructor");
    }
    @Override  // this is just aded to inform that the method is overriding or it is  like an alarm  otherwise  it is of no use 
    public void pt(){
        System.out.println("hello wrold");
    }
}
