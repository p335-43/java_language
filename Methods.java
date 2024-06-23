public class Methods {
     int add(int a,int b){
        if(a>b){
            return a+b;
        }
        else{
            return (a+b)*5;
        }
    }

    static int add(int d, int e, int f){
        return (d+e+f);
    }
    public static void main(String[] args) {
     //System.out.println(add(3,4));   
    Methods obj = new Methods();
    int c = obj.add(2,4);
    System.out.println(c);


    System.out.println(add(2,3,4));
    }
}
