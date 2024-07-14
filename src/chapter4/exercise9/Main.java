package chapter4.exercise9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        System.out.printf("The Unicode for the character %c is %d%n", character, (int) character);
    }
}
