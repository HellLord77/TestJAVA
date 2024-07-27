package chapter5.exercise49;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String vowels = "AEIOU";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine().toUpperCase();

        int countVowel = 0;
        int countConsonant = 0;
        for (char character : string.toCharArray()) {
            if (vowels.indexOf(character) != -1) {
                ++countVowel;
            } else if ('A' <= character && character <= 'Z') {
                ++countConsonant;
            }
        }
        System.out.printf("The number of vowels is %d%n", countVowel);
        System.out.printf("The number of consonants is %d%n", countConsonant);
    }
}
