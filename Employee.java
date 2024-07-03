// Private Access Modifiers 

import java.util.Random;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Employeeone ravi  = new Employeeone("pranjal",2333);
        // ravi.setid(34);
        // ravi.setname("pranjal");
        // System.out.println(ravi.getname());
        // System.out.println(ravi.getid());

        Cylinder gut = new Cylinder(12,14);
        // gut.setr(10,7);
        // float pie =22/7f;
        // int randius = gut.getr();
        // int height= gut.geth();
        // float volume = (pie*randius*randius*height);
        // float surface_Area= (2*pie*randius)*(height+randius);
        // System.out.println("volume is "+ volume);
        // System.out.println("surface area  "+surface_Area);

        System.out.println(gut.getr());
        System.out.println(gut.geth());
      
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

// class Guessthenumber{
//     int guess_number;
//     int Random = new Random(100);

//     public void inputnumber(int n){
//         guess_number=n;
//     }


// }

class Cylinder{
    private int r,h;
    // void setr(int rad,int hei){
    //     r=rad;
    //     h=hei;
    // }
    int getr(){return r;}
    int geth(){return h;}

    public Cylinder(int radius,int height){
        r= radius;
        h= height;
    }

}
