public class Constructors {
    public static void main(String[] args) {

    //   Employee df= new Employee("harsh",345);
      Employee df= new Employee();

      Employee pf= new Employee("aaryan");
    Employee gh= new Employee(10000);
    System.out.println(gh.salary());


    // df.setname("harry");
    

    // df.setid(55);

    System.out.println(df.getname());
    System.out.println(df.getid());

    System.out.println(pf.getname());
    System.out.println(pf.getid());


        
    }

    
}

class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int salary1){
salary= salary1 ;
    }

    public void getsal(int n){
        salary=n;
    }

    public int salary(){
        return salary;
    }

    public Employee(){
        name= "pranjal";
        id=45;
    }

    public Employee(String myname,int myid){
        name= myname;
        id=myid;
    }

    public Employee(String myname){
        name= myname;
        id=34;
    }

    public String getname(){
        return name;
    }

    public void setname(String n){
    this.name=n ;
    }

    public void setid(int i){
        this.id=i; 
    }

    public int getid(){
        return id;
    }

    

}
