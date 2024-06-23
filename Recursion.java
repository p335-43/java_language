public class Recursion {

    static int sum(int a){
        if(a<0){
            return 0;
        }

        return a+sum(a-1);
    }

    // find the nth term of the fibonacci series using recurreion
    static int fibonacci(int n){
        if(n==1){
            return 0;

        }
        else if(n==2){
return 1;
        }
        else
        return fibonacci(n-1)+fibonacci(n-2);
    }

    // average of set of numbers passed as arguments
    static float avg(int ...f){
        int sum =0;
        for(int i : f){
            sum +=i;
        }
    
        return (float)sum/f.length;
    }

    static void rightangledtriangle(int n ){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //print the above rightangled triangle using recurssion

    static void rightangledtriangle1(int n){
        if(n>0){
            rightangledtriangle1(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertrightangledtriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }    }

    static void invertrightangledtriangle1(int n){
        if(n>0){
            for(int i=n;i>0;i--){
                System.out.print(" * ");
            }
            System.out.println();
            invertrightangledtriangle1(n-1);
        }
        
    }
    public static void main(String[] args) {
        //System.out.println(sum(5));
        //System.out.println(fibonacci(15));
        // System.out.println(avg(1,4,5,6,3,1));
        // rightangledtriangle(5);
        // rightangledtriangle1(5);

        // invertrightangledtriangle(5);
        invertrightangledtriangle1(6);
        
    }
}
