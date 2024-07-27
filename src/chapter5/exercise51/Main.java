package chapter5.exercise51;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static char[] getLongestCommonPrefix(char[] s1, char[] s2) {
        char[] result = new char[0];
        int[][] lengths = new int[s1.length + 1][s2.length + 1];
        for (int i = 0; i <= s1.length; i++) {
            for (int j = 0; j <= s2.length; j++) {
                if (i == 0 || j == 0) {
                    lengths[i][j] = 0;
                } else if (s1[i - 1] == s2[j - 1]) {
                    lengths[i][j] = lengths[i - 1][j - 1] + 1;
                    if (lengths[i][j] > result.length) {
                        result = Arrays.copyOfRange(s1, j - lengths[i][j], j);
                    }
                } else {
                    lengths[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();

        String prefix = String.valueOf(getLongestCommonPrefix(first.toCharArray(), second.toCharArray()));
        if (prefix.isEmpty()) {
            System.out.printf("%s and %s have no common prefix%n", first, second);
        } else {
            System.out.println("The common prefix is " + prefix);
        }
    }
}
