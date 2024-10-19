public class Finally {

    public static int gert(){
        try {
            int a =9;
            int b=3;
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        finally{
            System.out.println("end of the program");
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(gert());
       
        // System.out.println("end of the program");
        int a =9;
        double d ;
        for(int i=9;i>=0;i--){
            try {
                d=a/i;
                System.out.println(d);
            } catch (Exception e) {
                System.out.println(e);
                break;
                // TODO: handle exception
            }
            finally{

                System.out.println("the program of the choice ends here "+ i);
            }
        }
    }
}
