public class inheritance_in_interface {
    public static void main(String[] args) {

        sd s = new sd();
        s.maeth1();
        s.maeth2();
        
    }
}

/**
 * Innerinheritance_in_interface_1
 */
interface Innerinheritance_in_interface_1 {

    void maeth1();
    void maeth2();

}
   
interface h1 extends Innerinheritance_in_interface_1{
    void meth3();
    void meth4();
}

class sd implements h1{
    public void maeth1(){
        System.out.println("hi");
    }

    public void maeth2(){
        System.out.println("by..");

    }

    public void  meth3(){
        System.out.println("good");
    }

    public void meth4(){
        System.out.println("bad");
    }
}
