package chapter3.exercise12;

import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int num) {
        int numBk = num;
        int rev = 0;
        while (num > 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        return rev == numBk;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int num = scanner.nextInt();

        System.out.println(num + " is " + (isPalindrome(num) ? "" : "not ") + "a palindrome");
    }
}
