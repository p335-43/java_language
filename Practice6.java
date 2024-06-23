// arrays

//there are three ways to create an array in java 
public class Practice6 {
    public static void main(String[] args) {
        // String [] name;
        // name  = new String[4];
        String[] name ={"pranjal","mohit","rohan","swati"};
    
        // for(int i=name.length-1;i>=0;i--){
        //     System.out.println(name[i]);
        // }
        // System.out.println(name.length);






        //for-each loop in java 
        // for(String i : name ){
        //     System.out.println(i);
        // }

        // multi-dimensional array

        // int [][] flat={{2,4,5,67},{34,34,123,23,1,232,13}};
        int [][] flat;
        flat = new int[3][3];
        flat[0][0]=34;
        flat[0][1]=4;
        flat[0][2]=94;
        flat[1][0]=84;
        flat[1][1]=74;
        flat[1][2]=64;
        flat[2][0]=54;
        flat[2][1]=49;
        flat[2][2]=7;

        System.out.println(flat[0][2]);

        System.out.println("printing the 2-d array:-");

        for(int i=0;i<flat.length;i++){
            for(int j=0;j<flat[i].length;j++){
                System.out.print(flat[i][j]);
                System.out.print("  ");
            }
            System.out.println("\n");
        }


    

    
    } 
}
