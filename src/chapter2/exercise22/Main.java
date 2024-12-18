package chapter2.exercise22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount in int, for example 1156: ");
        int amount = scanner.nextInt();

        int remainingAmount = amount;
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println("\t" + numberOfOneDollars + " dollars");
        System.out.println("\t" + numberOfQuarters + " quarters");
        System.out.println("\t" + numberOfDimes + " dimes");
        System.out.println("\t" + numberOfNickels + " nickels");
        System.out.println("\t" + numberOfPennies + " pennies");
    }
}