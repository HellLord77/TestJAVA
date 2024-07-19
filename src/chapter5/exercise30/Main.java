package chapter5.exercise30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter annual interest: ");
        double interest = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();

        double multiplier = 1 + interest / 1200;
        double savings = 0;
        for (int i = 0; i < months; ++i) {
            savings = (amount + savings) * multiplier;
        }
        System.out.printf("Savings amount: %.3f%n", savings);
    }
}
