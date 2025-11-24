import java.util.Scanner;

public class Factorial {
    public static void main (String arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Factorial of : ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1; i<=num;i++)
        {
           fact= fact*i;
           System.out.println(fact);
    }
}
}
