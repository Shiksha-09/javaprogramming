import java.util.*;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);

        ListIterator<Integer> ltr = list.listIterator();
        System.out.println("Print element of LinkedList in forward direction ");
        while (ltr.hasnext()) {
            int x = ltr.next();
            if (x == 5) {
                ltr.remove();
            } else if (x == 10) {
                ltr.set(111);
            } else if (x == 40) {
                ltr.add(50);
            }
            System.out.println("/t======>" + list);

        }
    }
}
