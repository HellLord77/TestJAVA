package chapter6.exercise5;

import java.util.Scanner;

public class Main {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double tmp;
        if (num1 > num3) {
            tmp = num1;
            num1 = num3;
            num3 = tmp;
        }
        if (num1 > num2) {
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if (num2 > num3) {
            tmp = num2;
            num2 = num3;
            num3 = tmp;
        }
        System.out.printf("The sorted numbers are: %f %f %f%n", num1, num2, num3);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextInt();

        displaySortedNumbers(num1, num2, num3);
    }
}
