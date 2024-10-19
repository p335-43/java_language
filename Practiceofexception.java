import java.util.Scanner;

public class Practiceofexception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("enter the length of the object :");
        int a = sc.nextInt();
        System.out.println("enter the breadth of the object : ");
        int b= sc.nextInt();
        System.out.println("enter the height of the object : ");
        int c = sc.nextInt();

        if (a<=0 || b<=0 ||c<=0) {
            throw new NewExceptions();
            
        }
        else{
            System.out.println("The volume of the object is "+a*b*c);
        }}
        catch(NewExceptions e){
            System.out.println(e.getMessage());
            // System.out.println(e.Zero());
            e.Zero();
        }
        
    }
}

class NewExceptions extends Exception{

    // public NewExceptions(String message){
    //     super(message);
    //     // System.out.println("the parameter of the object cannot be negatove");
    // }

    public void Zero(){
        System.out.println("the dimensions of the object cannot be zeroor negative mind it ");
    }
}