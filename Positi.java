import java.util.Scanner;

public class Positi {
    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        }
        if (num == 0) {
            System.out.println("zero");
        }
    }
}
