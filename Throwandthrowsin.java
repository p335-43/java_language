public class Throwandthrowsin {

    public static int divide(int a ,int b) throws ArithmeticException{
        int result= a/b;
        return result;
    }

    public static double area(int r) throws NuExceptions{
        if (r<=0) {
            
                throw new NuExceptions();
            
            // catch (Exception e) {
            //     // TODO: handle exception
            //     System.out.println(e.getMessage());
            //     System.out.println(e.toString());
            // }
        }
        else {
        double g = Math.PI * r*r;
        return g;
    }

    }
    public static void main(String[] args) {
        try {
            int r =  divide(2, 0);
            System.out.println(r);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        try {
            double f = area(-3);
            System.out.println(f);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        
       
   
        
    }
}

class NuExceptions extends Exception{

    public String toString(){
        // System.out.println("the area cannot be zero");
        return "the area cannot be zero";
    }

    public String getMessage(){
        return "the readius cannot be negative";
    }


}
