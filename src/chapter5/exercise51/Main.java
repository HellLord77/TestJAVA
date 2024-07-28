package chapter5.exercise51;

import java.util.Scanner;

public class Main {
    public static String getLongestCommonPrefix(String first, String second) {
        for (int end = first.length(); end > 1; --end) {
            String prefix = first.substring(0, end);
            if (prefix.equals(second.substring(0, end))) {
                return prefix.strip();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();

        String prefix = getLongestCommonPrefix(first, second);
        if (prefix.isEmpty()) {
            System.out.printf("%s and %s have no common prefix%n", first, second);
        } else {
            System.out.println("The common prefix is " + prefix);
        }
    }
}
