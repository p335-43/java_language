import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
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
            // System.out.println("the division will produce the result "+ arr[a]/b);
            
            try {
                System.out.println("the number at the index of the array is " + arr[a]);
               
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("please enter the proper index of the array" + e );
                // TODO: handle exception
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("there is an error which is "+ e+"  it is caused if you are dividing the number by zero");
            // System.out.println(e);

            // TODO: handle exception
        }
        // catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("There is an error which is called  "+e+" and is caused mainly due to when you want the index which is not in the array");
        //     // System.out.println(e);

        //     // TODO: handle exception
        // }
        catch (Exception e) {
            System.out.println("please enter the proper number ");
            System.out.println(e);

            // TODO: handle exception
        }
    }
    
}
