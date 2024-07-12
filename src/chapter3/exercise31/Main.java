package chapter3.exercise31;

import java.util.Scanner;

public class Main {
    public static String getString(double amount, int currency) {
        return ((currency == 0) ? "$%.2f" : "%.2f yuan").formatted(amount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchange = scanner.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int currency = scanner.nextInt();

        if (currency == 0 || currency == 1) {
            System.out.print("Enter the " + (currency == 0 ? "dollar" : "RMB") + " amount: ");
            double from = scanner.nextDouble();

            double to = from * ((currency == 0) ? exchange : 1 / exchange);
            System.out.println(getString(from, currency) + " is " + getString(to, 1 - currency));
        } else {
            System.out.println("Incorrect input");
        }
    }
}