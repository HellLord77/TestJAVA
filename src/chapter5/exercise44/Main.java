package chapter5.exercise44;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String numberString = Integer.toBinaryString(number);
        if (number < 0) {
            System.out.printf("The bits are %s%n%n", numberString.substring(16, 32));
        } else {
            System.out.printf("The bits are %016d%n", Integer.parseInt(numberString));
        }
    }
}
