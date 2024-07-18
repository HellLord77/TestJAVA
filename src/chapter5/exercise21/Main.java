package chapter5.exercise21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Number of Years: ");
        int years = scanner.nextInt();

        System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
        for (double interest = 5; interest <= 8; interest += 0.125) {
            double interestMonthly = interest / 1200;
            double monthly = amount * interestMonthly / (1 - 1 / Math.pow(1 + interestMonthly, years * 12));
            double total = monthly * years * 12;
            System.out.printf("%.3f%%\t\t\t\t%.2f\t\t\t\t%.2f%n", interest, monthly, total);
        }
    }
}
