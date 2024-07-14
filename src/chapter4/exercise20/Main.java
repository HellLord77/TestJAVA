package chapter4.exercise20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        System.out.printf("Length: %d%n", string.length());
        System.out.printf("First character: %c%n", string.charAt(0));
    }
}
