import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catchblock {
    public static void main(String[] args) {
        // int a =344;
        // int b=2;
        // try {
        //     int c = a/0;
        //     System.out.println(c);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("please divide with other number than 0 and negative " + e);
        // }
        // int c=a/0;
        // System.out.println(c);

        int[] arr = new int[4];
        arr[0]=22;
        arr[1]=34;
        arr[2]=45;
        arr[3]=56;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the idex of the arr you want for the dividened ");
        int a = sc.nextInt();
        System.out.println("enter the index of the array you want to take as the divisor ");
        int b = sc.nextInt();


        try {
            System.out.println("the result of the division of the aboe indexes are " + arr[a]/b);
        } 
        catch (ArithmeticException e) {
            System.out.println("there is an error which is "+ e+"  it is caused if you are dividing the number by zero");
            // System.out.println(e);

            // TODO: handle exception
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is an error which is called  "+e+" and is caused mainly due to when you want the index which is not in the array");
            // System.out.println(e);

            // TODO: handle exception
        }
        catch (Exception e) {
            System.out.println("please enter the proper number ");
            System.out.println(e);

            // TODO: handle exception
        }


    }
}
