public class Inheritance {
    public static void main(String[] args) {

        // InnerInheritance_1 I = new InnerInheritance_1();
        // I.sety(
        //     4
        // );
        // I.gety();
        // System.out.println(I.gety());


    // Dog goldenretriever= new Dog("dogs","goats");
    // goldenretriever.name = "frankie";
    // System.out.println(goldenretriever.name);
    // goldenretriever.Print_landanimal();

    Cats c = new Cats("mrinal","harsh","himanshu");
        
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

    public Animal(){
        System.out.println("all animals are good");
    }

    public Animal(String name){
        System.out.println("this type of animals ar more sweet and friendly : "+ name);
    }
}

class Dog extends Animal{
    public Dog(){
    // super("dogs");
    System.out.println("i am the constructor of the derived class");
}

public Dog(String name1, String name2){
    super(name1);
    System.out.println("overload constructor of derived class and printing the value of the name2 "+ name2);
}
   
}


class Cats extends Dog{

    public Cats(){
        System.out.println("this is the child class of the dog class");
    }

    public Cats(String name1,String name2, String name3){
        super(name1,name2);
        System.out.println("this will prin the name as : "+ name3);
    }
}

