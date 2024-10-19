import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(23);
        l1.add(33);
        l1.addLast(567);
        l1.addFirst(345);
        l1.add(333);
        for (int i = 0; i <l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}
