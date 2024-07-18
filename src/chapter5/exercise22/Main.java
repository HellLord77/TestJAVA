package chapter5.exercise22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double balance = scanner.nextDouble();

        System.out.print("Number of Years: ");
        int years = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double interest = scanner.nextDouble();

        int months = years * 12;
        double interestMonthly = interest / 1200;
        double monthly = balance * interestMonthly / (1 - 1 / Math.pow(1 + interestMonthly, years * 12));
        double total = monthly * years * 12;
        System.out.println();
        System.out.printf("Monthly Payment: %.2f%n", monthly);
        System.out.printf("Total Payment: %.2f%n", total);
        System.out.println();
        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for (int payment = 1; payment <= months; ++payment) {
            interest = interestMonthly * balance;
            double principal = monthly - interest;
            balance -= principal;
            System.out.printf("%d\t\t\t%5.2f\t\t%.2f\t\t%7.2f%n", payment, interest, principal, balance);
        }
    }
}
