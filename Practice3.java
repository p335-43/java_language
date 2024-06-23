import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        // String name = "this  is pranjal and i live in gurgaon";
        // System.out.println(name.replace(" ", "_"));
        // String name1= "bhava";
        // System.out.printf("dear %s , travels a lot ", name1);
        // System.out.println();
        // System.out.println(name.indexOf("  "));

        boolean name = true;
        System.out.println(!name);
        Scanner sc = new Scanner(System.in);
        // int age= sc.nextInt();

        // switch (age) {
        //     case 56:
        //     System.out.println("you are experienced ");
                
        //         break;
        //     case 18:
        //     System.out.println("you are an adult");
        //     break;

        //     case 22:
        //     System.out.println("you are eligible for the alcohol");
        
        //     default:
        //         break;
            
        //     case 20:
        //     System.out.println();
        // }
        // int a=sc.nextInt();
        // int b= sc.nextInt();
        // int c =sc.nextInt();

        // float result = (a+b+c)/3f;

        // if(result>=40 && a>=33 && b>=33 && c>=33){
        //     System.out.println("you have passed the fucking exam");
        // }
        // else{
        //     System.out.println("you have failed the exam");
        // }

        // float slaray;
        // System.out.println("enter your salary in lakhs");
        // slaray=sc.nextFloat();

        // if(slaray<2.5){
        //     System.out.println("there will no income tax for you to pay");
        // }
        // else if(slaray>2.5 && slaray<5.0){
        //     System.out.println("you have to pay the tax amout of "  + (slaray-2.5) *0.05 + "lacs");
        // }

        String website = sc.nextLine();
        
        if(website.endsWith(".com")){
            System.out.println("it is a commercial website");
        }

        else if(website.endsWith(".org")){
            System.out.println("it is an organisational website");
        }

        else if (website.endsWith(".in")){
            System.out.println("it is an indian website");
        }


        sc.close();
        

    }
}
