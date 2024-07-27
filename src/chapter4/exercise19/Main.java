package chapter4.exercise19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as string: ");
        String isbn = scanner.next();

        System.out.printf("The ISBN-10 number is %s", isbn);
        int checksum = 0;
        for (int i = 0; i < isbn.length(); ++i) {
            int digit = isbn.charAt(i) - '0';
            checksum += digit * i;
        }
        checksum %= 11;
        System.out.println(checksum == 10 ? 'X' : String.valueOf(checksum));
    }
}
