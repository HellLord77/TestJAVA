package chapter3.exercise7;

import java.util.Scanner;

public class Main {
    public static void display(int amount, String singular, String plural) {
        if (amount != 0) {
            System.out.println("\t" + amount + " " + (amount == 1 ? singular : plural));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount in int, for example 11.56: ");
        double amount = scanner.nextDouble();

        int remainingAmount = (int) (amount * 100);
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
        display(numberOfOneDollars, "dollar", "dollars");
        display(numberOfQuarters, "quarter", "quarters");
        display(numberOfDimes, "dime", "dimes");
        display(numberOfNickels, "nickel", "nickels");
        display(numberOfPennies, "penny", "pennies");
    }
}
