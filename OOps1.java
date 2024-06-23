public class OOps1 {
    public static void main(String[] args) {

    //     Employee pranjal = new Employee(); // Instantiating a new Employee object 

    //     //setting the attribute of an object 
     
    //     pranjal.salary=600706056;
    //     pranjal.name = "rahul";
    //     // System.out.println(pranjal.id);
    //     int salary = pranjal.getssalary();
    //     String nm = pranjal.getname();
        

    //     System.out.println(salary);
    //     System.out.println(nm);
    //   pranjal.changename("kavita");
    //   System.out.println(pranjal.getname());

    // Cellphone x = new Cellphone();
    
    // x.Emt1();
    // x.Emt2(); 


    // Square s = new Square();
    // s.side=5;
    // System.out.println(s.perimeter());
    // System.out.println(s.area());

    TommyVecetti v= new TommyVecetti();
    v.fire();
    v.run();
    v.hit();
        
    }
}

class Employee{
    String name;
    int salary;
  

    public int getssalary(){
        return salary;
    }



    public String getname(){
        return name;
    }

    public void changename(String name1 ){
        name = name1;
    }

}

class  Cellphone {

public void Emt1(){
    System.out.println("ringing.....");
}

public void Emt2(){
    System.out.println("vibrating....");
}    
}

 class Square{
    int side;
    public int perimeter(){
        return 4*side;
    }

    public int area(){
        return side*side;
    }
 }

 class TommyVecetti{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running away from enemy");
    }
    public void fire(){
        System.out.println("firing the enemy");
    }
 }




