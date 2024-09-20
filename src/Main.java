//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Total bill: ");
        String bill= scan.nextLine();
        double bill_num=Double.parseDouble(bill);
        System.out.print("Tip Percentage: ");
        String tip= scan.nextLine();
        double tip_percentage=Double.parseDouble(tip);
        tip_percentage/=100;
        System.out.print("Number of people: ");
        String ppl= scan.nextLine();
        int num_ppl=Integer.parseInt(ppl);

        double total_tip= (bill_num*tip_percentage);
        double total_bill= bill_num+total_tip;
        double tip_pp= total_tip/num_ppl;
        double total_pp= tip_pp+ (bill_num/num_ppl);

        System.out.println();
        System.out.printf("Total tip amount: %.2f%n", total_tip);
        System.out.println();
        System.out.printf("Total bill including tip: %.2f%n ", total_bill);
        System.out.println();
        System.out.printf("Tip per person: $ %.2f%n", tip_pp);
        System.out.println();
        System.out.printf("Bill per person: $ %.2f%n", total_pp);
        System.out.println();

    }
}