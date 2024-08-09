public class Oops {
    public static void main(String[] args) {

        Pen ballpen = new Pen();
        ballpen.brand="cello";
        ballpen.color="blue";
        ballpen.Pirntcolor();
        
        System.out.println(ballpen.brand);
        System.out.println(ballpen.color);

        ballpen.printColor();
    }
}

class Pen{
    String color;
    String brand;
    public static void Pirntcolor(){
        System.out.println("this is the class of the pen");
    }

    public  void printColor(){
        System.out.println(color);
    }

    public Pen(){
        System.out.println("this is where a constructor is called ");
    }
}
