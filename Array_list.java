import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sk = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter name of  " + (i + 1) + "Students");
            String name = sk.nextLine();
            list.add(name);
        }
        System.out.println("Student list before update,delete ");
        for (int i = 0; i < list.size(); i++) {
            String n = list.get(i);// read
            System.out.println(" " + n);
            if (n.equals("Shiksha")) {
                list.set(i, "xxx");
            } else if (n.equals("Sikha")) {
                list.remove(i);
            }
            System.out.println("Student list afterr update " + n);
        }

    }
}
