package chapter4.exercise22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = scanner.nextLine();

        System.out.printf("%s is ", s2);
        if (!s1.contains(s2)) {
            System.out.print("not ");
        }
        System.out.printf("a substring of %s%n", s1);
    }
}
