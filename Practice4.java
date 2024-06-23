import java.util.Scanner;
import java.math.*;

public class Practice4 {
    public static void main(String[] args) {
        //0=stone 1=papaer 2=scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice: ");
        int a= sc.nextInt();

        while(a>3 || a<0){
            System.out.println("please write the correct choice ");
            break;
        }

        int cc = (int)(Math.random()*3);
        System.out.println("computer\'s choice: "   + cc);

        if( a == cc){
            System.out.println("that's a tie!");
        }
        else if((a==0 && cc==2) || (a==1 && cc==0) || (a==2 && cc==1) ){
            System.out.println("you won the match!");
        }
        else {
            System.out.println("computer win!! you loose!");
        }

    sc.close();

        
    }
}
