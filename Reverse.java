// import java.util.Scanner;

// public class Reverse {
//     public static void main(String args[]) {

//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter number");
//         int num = obj.nextInt();
//         int rev = 0;
// //digit=4
//         while (num != 0) {
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//             System.out.print(digit);

//         }

//     }
// }
//  a\\\\\\\\
//  bc
//  def
//  ghij

public class Reverse {
    public static void main(String args[]) {
        char i = 'a';

        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                if (c <= r) {
                    System.out.print(i++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}