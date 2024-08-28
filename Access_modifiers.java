package Kite;
public class Access_modifiers {
    public static void main(String[] args) {

        C1 h = new C1();
        // h.met1();
        System.out.println(h.a);
        System.out.println(h.b);
        // System.out.println(h.c);
        System.out.println(h.g);
        
    }
}

class C1{
    protected int a =45;
    public int b=89;
    private int c=99;
    int g = 23;
    public void met1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(g);
    }
}
