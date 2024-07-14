package chapter3.exercise9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = scanner.nextInt();

        System.out.print("The ISBN-10 number is ");
        int checksum = 0;
        for (int i = 1; i < 10; i++) {
            int digit = (int) (isbn / Math.pow(10, 9 - i)) % 10;
            System.out.print(digit);
            checksum += digit * i;
        }
        checksum %= 11;
        System.out.println(checksum == 10 ? 'X' : String.valueOf(checksum));
    }
}
