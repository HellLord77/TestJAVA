package chapter3.exercise13;

import java.util.Scanner;

public class Main {
    public static double min(double a, int b) {
        return a < b ? a : b;
    }

    public static double getTax(double income, int limit1, int limit2, int limit3, int limit4, int limit5) {
        double tax = 0;
        if (income > 0) {
            tax += min(income, limit1) * 0.10;
        }
        if (income > limit1) {
            tax += (min(income, limit2) - limit1) * 0.15;
        }
        if (income > limit2) {
            tax += (min(income, limit3) - limit2) * 0.25;
        }
        if (income > limit3) {
            tax += (min(income, limit4) - limit3) * 0.28;
        }
        if (income > limit4) {
            tax += (min(income, limit5) - limit4) * 0.33;
        }
        if (income > limit5) {
            tax += (income - limit5) * 0.35;
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();

        System.out.println("Tax:");
        double tax;
        tax = getTax(income, 8350, 33950, 82250, 171550, 372950);
        System.out.printf("\tSingle: %.2f\n", tax);
        tax = getTax(income, 16700, 67900, 137050, 208850, 372950);
        System.out.printf("\tMarried Filing Jointly or Qualifying Widow(er): %.2f\n", tax);
        tax = getTax(income, 8350, 33950, 68525, 104425, 186475);
        System.out.printf("\tMarried Filing Separately: %.2f\n", tax);
        tax = getTax(income, 11950, 45500, 117450, 190200, 372950);
        System.out.printf("\tHead of Household: %.2f\n", tax);
    }
}
