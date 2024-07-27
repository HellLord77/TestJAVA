package chapter5.exercise46;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        String reverse = "";
        for (char character : string.toCharArray()) {
            reverse = character + reverse;
        }
        System.out.printf("The reversed string is %s%n", reverse);
    }
}
