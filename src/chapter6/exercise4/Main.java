package chapter6.exercise4;

import java.util.Scanner;

public class Main {
    public static int reverse(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

        int reverse = reverse(integer);
        System.out.printf("Reverse is: %d", reverse);
    }
}
