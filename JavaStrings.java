public class JavaStrings {
    public static void main(String[] args) {
        //String name = new String("pranjal");

        // String name = "pranjal";
        // name ="happy";

        // System.out.println(name);


        // int a =8;
        // int b=9;
        // System.out.printf("the value of a is %d and value of b is %d ",a ,b);
        // System.out.format("the value of a is %d and value of b is %d ",a ,b);

        String name = "this is pranjal";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.indexOf("pranjal"));
        System.out.println(name.trim());
        System.out.println(name.substring(8,11));
        System.out.println(name.replace("pra", "bri"));
        System.out.println(name.startsWith("t"));
        System.out.println(name.charAt(8));
        System.out.println(name.indexOf('p',5));
        System.out.println(name.lastIndexOf("s"));
        System.out.println(name.lastIndexOf("p",8));
        System.out.println(name.equals("this is pranjal"));
        System.out.println(name.equalsIgnoreCase("THIS IS PRANJAL"));
        System.out.println("thi is \npranka;");
        
        
    }
}
