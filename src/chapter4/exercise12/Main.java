package chapter4.exercise12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String decimal = scanner.next().substring(0, 1);

        int integer;
        try {
            integer = Integer.parseInt(decimal, 16);
        } catch (NumberFormatException e) {
            System.out.printf("%s is an invalid input%n", decimal);
            return;
        }
        System.out.printf("The binary value is %s%n", Integer.toBinaryString(integer));
    }
}
