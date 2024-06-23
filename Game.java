
// create a game to guess the number at once  

import java.util.Scanner;
import java.math.*;

public class Game {
    public static void main(String[] args) {

        Game1 gam= new Game1();
        // gam.takeinput();
        gam.getrandom();
        // System.out.println(gam.getrandom());
        gam.takeinput();
        System.out.println(gam.iscorrect());
       
        
    }
}

class Game1{
private int randomnumber;
    int noofguess;
    int inputnumber;

public Game1(){
this.randomnumber = (int)(Math.random()*101);
}

public int getrandom(){
    return randomnumber;
}

public int getnoofguess(){
return noofguess;
}

public void setnoofguess(int n){
    this.noofguess=n;
}

public void takeinput(){
    System.out.println("guess the number: ");
    Scanner sc= new Scanner(System.in);
    inputnumber=sc.nextInt();
}

boolean iscorrect(){
    if(inputnumber==randomnumber){
        return true;
    } 
    else {
        return false;
    }
}


}
