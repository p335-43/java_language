public class Interface {
    public static void main(String[] args) {
        InnerInterface_1 b = new Car();
        b.applybrakes();
        b.applyrace();
        
        Innerinterface_2 c = new Car();
        c.brakeapplies(4);   
        // b.v=90;
        System.out.println(b.v);
        
    }
}

/**
 * InnerInterface_1
 
 */
interface InnerInterface_1 {
    int v=34;
    void applybrakes();
    void applyrace();
    
}

/**
 * InnerInterface
 */
interface InnerInterface_4 {
    void Sayhello();
    void Syagoodbye();
    
}

class Car implements InnerInterface_1,Innerinterface_2,InnerInterface_4{

    @Override
    public void applybrakes(){
        System.out.println("brakes are applies");

    }
    @Override
    public void applyrace(){
        System.out.println("the vehicle will start running");
    }

    int speed=7;
    @Override
    public void brakeapplies(int speed){
        speed-=1;
        System.out.println(speed);
    }

    @Override
    public void raceapplied(int speed){
        speed+=1;
        System.out.println(speed);
    }

    @Override
    public void Sayhello(){
        System.out.println("hello");

    }
    @Override
    public void Syagoodbye(){
        System.out.println("goodbye");
    }

}


/**
 * _2
 */
 interface  Innerinterface_2{

    void brakeapplies(int decrement);
    void raceapplied(int increment);
}

