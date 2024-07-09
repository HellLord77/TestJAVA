package chapter2.exercise21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        double futureInvestmentValue = investmentAmount + investmentAmount * numberOfYears * annualInterestRate / 100;
        System.out.println("Accumulated value is $" + futureInvestmentValue); // TODO
    }
}