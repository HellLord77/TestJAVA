package chapter5.exercise14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        int gcd = Math.min(num1, num2);
        while (!(num1 % gcd == 0 && num2 % gcd == 0)) {
            --gcd;
        }
        System.out.printf("The greatest common divisor for %d and %d is %d%n", num1, num2, gcd);
    }
}
