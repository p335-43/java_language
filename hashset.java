import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(6,0.5f);
        h.add(12);
        h.add(14);
        h.add(12);
        h.add(1);
        h.add(2);
        System.out.println(h);
        System.out.println(h.contains(1));
        h.clear();
        System.out.println(h);

    }
}
