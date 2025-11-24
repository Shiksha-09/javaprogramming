import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int icuCharge = 5000;
        int privateCharge = 3000;
        int generalCharge = 1000;

        int totalBill = 0;
        String improve = "yes";

        System.out.println("----- Zindagi Hospital -----");
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Condition (Critical / Serious / Normal): ");
        String condition = sc.nextLine().toLowerCase();

        // agar patient critical hai
        if (condition.equals("critical")) {
            System.out.print("Enter days in ICU: ");
            int days = sc.nextInt();
            totalBill = totalBill + (days * icuCharge);
            condition = "serious"; // ICU ke baad serious maana
        }

        // jab tak discharge nahi hota loop chalegi
        while (!condition.equals("discharged")) {
            if (condition.equals("serious")) {
                System.out.print("Enter days in Private Room: ");
                int days = sc.nextInt();
                totalBill = totalBill + (days * privateCharge);

                System.out.print("Condition improved? (yes/no): ");
                sc.nextLine(); // buffer clear
                improve = sc.nextLine().toLowerCase();

                if (improve.equals("yes")) {
                    condition = "normal"; // next step
                } else {
                    condition = "discharged";
                }
            } else if (condition.equals("normal")) {
                System.out.print("Enter days in General Ward: ");
                int days = sc.nextInt();
                totalBill = totalBill + (days * generalCharge);
                condition = "discharged"; // normal ke baad discharge
            }
        }

        System.out.println("\n----- Final Bill -----");
        System.out.println("Patient Name : " + name);
        System.out.println("Total Amount : Rs. " + totalBill);
        System.out.println("Patient Discharged ✅");
    }
}
