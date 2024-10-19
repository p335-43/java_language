import java.util.Scanner;

public class Exceptionclass {
    public static void main(String[] args) {
      int n ;
      Scanner sc = new Scanner(System.in);
      n= sc.nextInt();
      if (n<99) {
        try {
            throw new MyException();
            // throw new ArithmeticException("kaise ho");
        } catch (Exception e) {
            // TODO: handle exception
            // System.out.println( e.getMessage());
            System.out.println(e.toString());
            // e.printStackTrace();
        }
       
        
      }
        
    }
}

class MyException extends Exception{

    @Override
    public String toString(){
        return super.toString() + "I am to string";
    }

    @Override
    public String getMessage(){
        return super.getMessage() + " I am a get message";
    }

}
