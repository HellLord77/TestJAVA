package chapter5.exercise37;

import java.util.Scanner;

public class Main {
    public static String convertBase(String number, int baseFrom, int baseTo) {
        String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int decimal = 0;
        int power = 1;
        while (!number.isEmpty()) {
            char symbol = number.charAt(number.length() - 1);
            number = number.substring(0, number.length() - 1);
            decimal += symbols.indexOf(symbol) * power;
            power *= baseFrom;
        }

        String result = "";
        while (decimal != 0) {
            result = symbols.charAt(decimal % baseTo) + result;
            decimal /= baseTo;
        }
        if (result.isEmpty()) {
            result = symbols.substring(0, 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        String decimal = scanner.nextLine();

        System.out.printf("Binary: %s", convertBase(decimal, 10, 2));
    }
}
