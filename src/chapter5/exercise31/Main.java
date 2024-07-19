package chapter5.exercise31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double deposit = scanner.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double yield = scanner.nextDouble();

        System.out.print("Enter maturity period (number of months):  ");
        int months = scanner.nextInt();

        double multiplier = 1 + yield / 1200;
        double value = deposit;
        System.out.println("Month\tCV Value");
        for (int month = 1; month <= months; ++month) {
            value *= multiplier;
            System.out.printf("%d\t\t%.2f%n", month, value);
        }
    }
}
