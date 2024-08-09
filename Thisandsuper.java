public class Thisandsuper {
    public static void main(String[] args) {

        // Ekclass n = new Ekclass(5);
        // System.out.println(n.a);
        // n.Seta(34);
        // System.out.println(n.Geta());
        // n.Geta();

        two t = new two();

        
    }
}

class Ekclass{
    int a ;

    Ekclass(int v){
        a=v;
    }

    // void Seta(int s){
    //     this.a=s;
    // }

    int Geta(){
        return a;
    }

    int Returnone(){
        return 1;
    }
}

class two extends Ekclass{

    // super(2);

    two(){
        super(2);
        System.out.println(a);
    }
}
