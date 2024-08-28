public class Abstract {

    public static void main(String[] args) {
        // InnerAbstract b = new InnerAbstract();
        // InnerAbstract_1 m = new InnerAbstract_1();
        // m.greet();
        InnerAbstract b = new InnerAbstract_1();
        b.Ia();
        b.greet();
    }
}

/**
 * InnerAbstract
 */
abstract class InnerAbstract {

    public InnerAbstract(){
        System.out.println("this is the contructor of the super class");
    }

    public void Ia(){
        System.out.println("namaste");
    }

    abstract public void greet();
}
/**
 * InnerAbstract_1
 */
class InnerAbstract_1 extends InnerAbstract {
    
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    
}

/**
 * InnerAbstract_2
 */
abstract class InnerAbstract_2 extends InnerAbstract {

}