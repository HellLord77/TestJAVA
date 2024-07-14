package chapter4.exercise14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char grade = scanner.next().charAt(0);

        int numeric = switch (grade) {
            case 'A' -> 4;
            case 'B' -> 3;
            case 'C' -> 2;
            case 'D' -> 1;
            case 'F' -> 0;
            default -> -1;
        };
        if (numeric == -1) {
            System.out.printf("%s is an invalid grade%n", grade);
        } else {
            System.out.printf("The numeric value for grade %s is %d%n", grade, numeric);
        }
    }
}
