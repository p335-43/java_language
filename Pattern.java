public class Pattern {
    public static void main(String[] args) {
        int a =12;
        char ch ='B';
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}