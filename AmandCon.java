public class AmandCon {


    public static void main(String[] args) {

        Employee pranjal = new Employee();

        pranjal.setname("harry");
        System.out.println(pranjal.getname());


        

        
    }
}

class Employee{
    private int id;
    private String name;

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

//access modifier 
class Emploee1{
    private int id1;
    private String name1;

    public void Setname(String n){
        name1=n;
    }

}

       