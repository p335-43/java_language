public class Revresenumber { 
  
    public static void main(String[] args) {
    Employee pranjal= new Employee();

    // pranjal.salary=1200;
    // pranjal.name="jazlyn";
    // int salary= pranjal.getSalary();
    // System.out.println(salary);
    // System.out.println(pranjal.getname());
    // pranjal.setName("jazzlyn");
    // // System.out.println(pranjal.setName("jazzlyn"));    
    // System.out.println(pranjal.getname());
    

    Square s = new Square();
    s.side=20;
    s.Area();
    s.Perimeter();
    }


}

   // creating our own class
class Employee{
   String name;
   int salary;

   public  static void PrintDetails(){ 
    System.out.println(name);
   }
   public String getname(){
    return name;
   }

   public int getSalary(){
    return salary;
   }
   public void setName(String n){
    name=n;
   }
   }

class Square{
    int side;
    public void Area(){
        System.out.println("Area is "+ side*side);
    }
    public void Perimeter(){
        System.out.println("perimeter is "+ 4*side);
    }
}
