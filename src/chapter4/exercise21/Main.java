package chapter4.exercise21;

import java.util.Scanner;

public class Main {
    public static boolean isDigits(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isValid(String str, int length) {
        return length == str.length() && isDigits(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String ssn = scanner.nextLine();

        System.out.printf("%s is ", ssn);
        String[] parts = ssn.split("-");
        if (!(parts.length == 3 && isValid(parts[0], 3) && isValid(parts[1], 2) && isValid(parts[2], 4))) {
            System.out.print("not ");
        }
        System.out.println("a valid social security number");
    }
}
