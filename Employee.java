// Private Access Modifiers 

public class Employee {
    public static void main(String[] args) {
        Employeeone ravi  = new Employeeone("pranjal",2333);
        // ravi.setid(34);
        // ravi.setname("pranjal");
        System.out.println(ravi.getname());
        System.out.println(ravi.getid());


      
    }

}

class Employeeone{
    private int id;
    private String name;

    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){
        id=i;
    }
    public int getid(){
        return id;
    }

    //Constructor
    public Employeeone(){
        id=33;
        name="jazlyn";
    }

    public Employeeone(String myname,int idd){
        id=idd;
        name=myname;
    }
}
