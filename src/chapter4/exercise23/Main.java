package chapter4.exercise23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = scanner.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double ratePay = scanner.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = scanner.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = scanner.nextDouble();

        double pay = hours * ratePay;
        double federalTax = federalTaxRate * pay;
        double stateTax = stateTaxRate * pay;
        double tax = federalTax + stateTax;
        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Hours Worked: %.2f%n", hours);
        System.out.printf("Pay Rate: $%.2f%n", ratePay);
        System.out.printf("Gross Pay: $%.2f%n", pay);
        System.out.println("Deductions");
        System.out.printf("\tFederal Withholding (%.1f%%): $%.2f%n", federalTaxRate * 100, federalTax);
        System.out.printf("\tState Withholding (%.1f%%): $%.2f%n", stateTaxRate * 100, stateTax);
        System.out.printf("\tTotal Deduction: $%.2f%n", tax);
        System.out.printf("Net Pay: $%.2f%n", pay - tax);
    }
}
