package chapter4.exercise11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = scanner.nextInt();

        if (decimal > 15) {
            System.out.printf("%d is an invalid input%n", decimal);
        } else {
            System.out.printf("The hex value is %X%n", decimal);
        }
    }
}
