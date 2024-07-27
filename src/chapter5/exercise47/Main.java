package chapter5.exercise47;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = scanner.nextLine();

        if (isbn.length() == 12) {
            System.out.printf("The ISBN-13 number is %s", isbn);
            int checksum = 0;
            for (int i = 0; i < isbn.length(); ++i) {
                int digit = isbn.charAt(i) - '0';
                if (i % 2 == 1) {
                    digit *= 3;
                }
                checksum += digit;
            }
            checksum = 10 - checksum % 10;
            System.out.println(checksum == 10 ? 0 : checksum);
        } else {
            System.out.printf("%s is an invalid input%n", isbn);
        }
    }
}
