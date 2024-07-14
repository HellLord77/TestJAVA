package chapter4.exercise15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = scanner.next().toLowerCase().charAt(0);

        if ('a' <= letter && letter <= 'z') {
            int number = switch (letter) {
                case 'a', 'b', 'c' -> 2;
                case 'd', 'e', 'f' -> 3;
                case 'g', 'h', 'i' -> 4;
                case 'j', 'k', 'l' -> 5;
                case 'm', 'n', 'o' -> 6;
                case 'p', 'q', 'r', 's' -> 7;
                case 't', 'u', 'v' -> 8;
                case 'w', 'x', 'y', 'z' -> 9;
                default -> 0;
            };
            System.out.printf("The corresponding number is %d%n", number);
        } else {
            System.out.printf("%c is an invalid input%n", letter);
        }
    }
}
