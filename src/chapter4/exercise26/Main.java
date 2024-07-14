package chapter4.exercise26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        String amountString = scanner.nextLine();

        int radixIndex = amountString.indexOf(".");
        int numberOfOneDollars = Integer.parseInt(amountString.substring(0, radixIndex));
        int remainingAmount = Integer.parseInt(amountString.substring(radixIndex + 1));

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amountString + " consists of");
        System.out.println("\t" + numberOfOneDollars + " dollars");
        System.out.println("\t" + numberOfQuarters + " quarters");
        System.out.println("\t" + numberOfDimes + " dimes");
        System.out.println("\t" + numberOfNickels + " nickels");
        System.out.println("\t" + numberOfPennies + " pennies");
    }
}
