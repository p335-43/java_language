public class Constructorsininheritance {
    public static void main(String[] args) {

        // basse n = new basse();
        //basse1 n1 = new basse1(3,4);
        basse2 n3 = new basse2(23, 33, 45);

        
    }
}

class basse{
    int x;
     public void setx(int x){
        this.x=x;
     }

     public int getx(){
        return x;
     }

    basse(){
        System.out.println("this is the constructor of the main class ");
    }

    basse(int x ){
        System.out.println("this is an overloaded constructor " +x);
    }
}

class basse1 extends basse{
    // basse1(){
    //     super(2);
    // }

    basse1(int x ,int y){
        super(x);
        System.out.println(y);
    }
    int y ;
    public void setx(int y){
        this.y=y;
     }

     public int getx(){
        return y;
     }
}

class basse2 extends basse1{
    basse2(int x,int y, int z){
        super(x,y);
        System.out.println("this is the child of the basse1 class "+z);
    }
}


