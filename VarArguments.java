public class VarArguments {


    static int add(int ...c){
        int result=0;
        for(int a :c){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(add());
    }
}
