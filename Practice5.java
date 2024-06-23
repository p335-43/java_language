import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a=208;
        // do{
        //     System.out.println(a);
        //     a++;
        // }while(a<=200);
        // Scanner  sc = new Scanner (System.in);
        // int n= sc.nextInt();
        //  for(int i=0;i<n;i++){
        //     System.out.println(2*i+1);
        //     if(i==0){
        //         break;
        //     }
        //  }

        // int i=0;
        // while(i<10){
        //     System.out.println(i);
            
        //     if(i==6){
        //         break;
        //     }
        //     i++;
        // }


        //continue statement

        // for(int i=0;i<5;i++){
        //     if (i==2) {
        //         continue;
        //     }
        //     System.out.println(i);
        //     System.out.println("this is java!");
        // }

        // int i=0;
        // while (i<5) {
        //     i++;
        //     if(i==2){
        //         continue;
        //     }
            

        //     System.out.println("hello java "+ i);
        // }

        // int n=5;


        // for(int i=0;i<=n;i++){
        //     for(int j=n;j>=i;j--){
        //         System.out.print(" * ");

        //     }
        //     System.out.println();
        // }

        // int n=6;
        // int i=0;
        // int sum=0;
        // while(i<n){
        //     sum+=(2*i);
        //     i++;
            
        // }
        // System.out.println(sum);

        // int n=10;
        // int product=n;
        // for(int i=10;i>=1;i--){
        //     System.out.println(product +" x "+ i+ " =" +" "+product*i);
        // }

        // int n=5;
        // int fac=1;
        // for(int i=1;i<=n;i++){
        //    fac*=i;
        // }
        // System.out.println(fac);


        int n=8;
        int product=n;
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println(product +" x "+ i+ " =" +" "+product*i);
            sum += (product*i);
        }
        System.out.printf("and their sum is %d", sum);

          
        sc.close();  
    }
}
