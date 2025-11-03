import java.util.Scanner;

public class Prog_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double billAmount = 0;

        // Calculate bill using nested if–else
        if (units <= 50) {
            billAmount = units * 3.00;
        } else if (units <= 200) {
            billAmount = (50 * 3.00) + (units - 50) * 4.80;
        } else if (units <= 400) {
            billAmount = (50 * 3.00) + (150 * 4.80) + (units - 200) * 5.80;
        } else {
            billAmount = (50 * 3.00) + (150 * 4.80) + (200 * 5.80) + (units - 400) * 6.20;
        }

        System.out.print("Do you want to pay your bill online? (Y/N): ");
        char choice = sc.next().charAt(0);

        System.out.println(" ");

        double discount = 0;
        double amountPayable = billAmount;

        // Apply discount if online payment
        if (choice == 'Y' || choice == 'y') {
            discount = billAmount * 0.03;
            amountPayable = billAmount - discount;
            System.out.println("You received a 3% online payment discount of Rs. " + discount);
        }

        System.out.println("Total Electricity Bill: Rs. " + billAmount);
        System.out.println("Amount Payable: Rs. " + amountPayable);

    }
}
