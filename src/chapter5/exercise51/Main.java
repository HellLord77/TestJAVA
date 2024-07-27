package chapter5.exercise51;

import java.util.Scanner;

public class Main {
    public static String getLongestCommonPrefix(String s1, String s2) {
        String longest = "";
        for (int i = 0; i < s1.length(); ++i) {
            for (int j = i + 1; j < s1.length(); ++j) {
                if (j - i > longest.length()) {
                    for (int k = 0; k < s2.length(); ++k) {
                        for (int l = k + 1; l < s2.length(); ++l) {
                            if (s1.substring(i, j).compareTo(s2.substring(k, l)) == 0) {
                                longest = s1.substring(i, j);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return longest;
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
