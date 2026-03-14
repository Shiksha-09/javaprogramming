import java.util.*;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // ===== CREATE =====
        list.add("Aman");
        list.add("Riya");
        list.add("Shiksha");
        list.add("Rahul");

        System.out.println("After Create:");
        display(list);

        // ===== READ =====
        System.out.println("\nRead using Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // ===== UPDATE =====
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            String name = listItr.next();
            if (name.equals("Riya")) {
                listItr.set("Priya");
            }
        }

        System.out.println("\nAfter Update:");
        display(list);

        // ===== DELETE using Iterator =====
        Iterator<String> deleteItr = list.iterator();
        while (deleteItr.hasNext()) {
            String name = deleteItr.next();
            if (name.equals("Rahul")) {
                deleteItr.remove(); // Delete Rahul
            }
        }

        System.out.println("\nAfter Delete:");
        display(list);
    }

    // Method to display list
    public static void display(LinkedList<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }
}
