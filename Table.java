import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Table of : ");
        // int a=sc.nextInt();
       for(int a=2;a<=5;a++){
         for(int i=1;i<=10;i++){
            System.out.println(a+ " * " +i+ " = "+ a*i);
        }
        System.out.println();
       }
    }
}
