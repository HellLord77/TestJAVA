package chapter5.exercise50;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        int count = 0;
        for (char character : string.toCharArray()) {
            if ('A' <= character && character <= 'Z') {
                ++count;
            }
        }
        System.out.printf("The number of uppercase letters is %d%n", count);
    }
}
