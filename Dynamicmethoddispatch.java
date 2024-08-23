public class Dynamicmethoddispatch {
    public static void main(String[] args) {
        Z c = new X(); // this is allowed but the reverse is not allowed 
        c.joc();
        // c.j();
        c.po();
        
        
    }
}

class Z {

    void po(){
        System.out.println("house is sweet");
    }


    void joc(){
        System.out.println("helllo ji");
    }
}

class X extends Z{

    void joc(){
        System.out.println("Extended class method");
    }

    void pront(){
        System.out.println("jocker is kocker!!!");
    }
}