package chapter6.exercise2;

import java.util.Scanner;

public class Main {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

        int sum = sumDigits(integer);
        System.out.printf("The sum of the digits is: %d%n", sum);
    }
}
