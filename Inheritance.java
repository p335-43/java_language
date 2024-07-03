public class Inheritance {
    public static void main(String[] args) {

        // InnerInheritance_1 I = new InnerInheritance_1();
        // I.sety(
        //     4
        // );
        // I.gety();
        // System.out.println(I.gety());


    Dog goldenretriever= new Dog();
    goldenretriever.name = "frankie";
    System.out.println(goldenretriever.name);
    goldenretriever.Print_landanimal();
        
    }

    
    
}


class InnerInheritance {

    int x;
    public int getx(){
        return x;
    }

    public void setx(int x){
        System.out.println("hello world!!");
        this.x=x;
    }

    public void Print(){
        System.out.println("print me");
    }

}

/**
 * InnerInheritance_1
 */
class InnerInheritance_1 extends InnerInheritance{
    int y;
    
    public int gety(){
        return y;
    }

    public void sety(int y){
        System.out.println("kaise ho");
        this.y =y;
    }
}

class Animal{
    public void Print_landanimal(){
        System.out.println("they are friendly ");
        System.out.println("they are very joyfull");
        System.out.println("they are four legged animal");
    }

    void Water_animal(){
        System.out.println("they live in water");
    }
}

class Dog extends Animal{
    String name;
}

