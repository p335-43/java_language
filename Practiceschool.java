import java.util.Scanner;

public class Practiceschool {
   public static void main(String[] args) {
    int number = 466;
    int total = 500;
    float percentage = (float)number/total*100f;
    System.out.println(percentage);

   System.out.println();
   int x = 3;
   System.out.println(x<<1);
   System.out.println(x>>1);

   String fname = "pranjal";
   String lname = " Mishra";
   System.out.println(fname.concat(lname));

   System.out.println();

   System.out.println("i love pancakes\\strawberrys");

   System.out.println(Math.sqrt(25));
   System.out.println(Math.max(23,24));
   System.out.println(Math.abs(4.5)); // return the positive number of any positive or negative number 
   System.out.println((int)(Math.random()*2));


int n=5;
   for(int i =1;i<=n;i++){
      for(int j=0;j<=n;j++){
         System.out.print(" # ");
      }
      System.out.println();
   }
   System.out.println();
   for(int i =1;i<=n;i++){
      for(int j=1;j<=i;j++){
         System.out.print(" # ");
      }
      System.out.println();
   }

   String[] arr= {"jazlyn","pranjal","suhi","rishit"};
   for(String i: arr){
      System.out.print(i);
   }

   for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }

   int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
   int lowest=ages[0];
   for(int i =0;i<ages.length;i++){
      if(lowest>ages[i]){
         lowest=ages[i];
      }
   }
   System.out.println(lowest);


   int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
   for(int i=0;i<myNumbers.length;i++){
      for(int j=0;j<myNumbers[i].length;j++){
         System.out.print(myNumbers[i][j]);
      }
      System.out.println();
   }

   Arr(ages);

   System.out.println("total of 4,3,2,5,6 is "+ Sumusingvararga(4,3,2,5,6));




   Scanner sc = new Scanner(System.in);
   // int g= sc.nextInt();
   // for(int i=0;i<g;i++){
   //    System.out.print(Fibonacci(i)+" ");
   // }

   // Downstars(g);
   // System.out.println(Fibonacci(g));
   // System.out.println(Average(2,3,4,5,6,7,8,9,10,11));
   Downstars_rec(5);
   Upperstar_rec(5);


   } 

   public static void Arr(int[] arr){
      for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
      }
   }

   public static int Sumusingvararga(int... arr){
      int total=0;
      for(int a : arr){
         total+=a;
      }
      return total;
   }


   public static int Fibonacci(int n){
      if(n<=1){
         return n;
      }
      else{
         return Fibonacci(n-1)+Fibonacci(n-2);
      }
   }

   public static void Downstars(int n){
      for(int i=0;i<n;i++){
         for(int j=n;j>i;j--){
            System.out.print(" * ");
         }
         System.out.println();
      }
   }
   public static void Downstars_rec(int n){
      if(n>0){
         for(int j=n;j>0;j--){
            System.out.print(" * ");
         }
         System.out.println();
      Downstars(n-1);
   }
      }
   
   public static void Upperstar_rec(int n){
      if(n>0){
         Upperstar_rec(n-1);
         for(int i=0;i<n;i++){
            System.out.print(" * ");
         }  
      System.out.println();    }
   }
   

   public static float Average(int... n){
      int total=0;
      for(int a : n){
         total+=a;
      }
      float average= (float)total/n.length;
      return average;
   }
}
