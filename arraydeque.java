import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.add(6);
        // for (int i = 0; i < d.size(); i++) {
        //     System.out.println(d.getFirst(i));
            
        // }
        System.out.println(d.getFirst());

    }
    
}
