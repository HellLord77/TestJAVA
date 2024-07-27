package chapter5.exercise48;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        for (int index = 0; index < string.length(); index += 2) {
            System.out.print(string.charAt(index));
        }
        System.out.println();
    }
}
