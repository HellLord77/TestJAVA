package chapter4.exercise13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String vowels = "AEIOU";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = scanner.next().substring(0, 1);

        String letterUpper = letter.toUpperCase();
        char character = letter.charAt(0);
        if (vowels.contains(letterUpper)) {
            System.out.printf("%s is a vowel%n", letter);
        } else if ('A' <= character && character <= 'Z') {
            System.out.printf("%s is a consonant%n", letter);
        } else {
            System.out.printf("%s is an invalid input%n", letter);
        }
    }
}
