package chapter4.exercise8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int ascii = scanner.nextInt();

        System.out.printf("The character for ASCII code %d is %c%n", ascii, ascii);
    }
}
