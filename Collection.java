import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,3);
        l1.add(3,4);
        l1.add(4,5);
        l1.addAll(l2);

        System.out.println(l1.contains(12));
        System.out.println(l1.indexOf(123));
    //    l1.clear();
    l1.remove(4); //here the number at the index 4 will be removed 
    l1.set(0, 34); // konse index pe aap kya daalna chahte ho 
       for (Integer integer : l1) {
           System.out.println(integer);
       }
    }
}
