import java.util.Scanner;

public class One {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a name ");
        String name = obj.nextLine();
        System.out.println(name);

        System.out.println("Enter your age ");
        int age=obj.nextInt();
        System.out.println(age);

        System.out.println("Enter your character");
        char letter =obj.nextLine().charAt(0);
        System.out.print(letter);
        
        obj.close();

    }
}
 