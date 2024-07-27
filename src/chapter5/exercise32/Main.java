package chapter5.exercise32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lottery1 = (int) (Math.random() * 10);
        int lottery2 = lottery1;
        while (lottery2 == lottery1) {
            lottery2 = (int) (Math.random() * 10);
        }
        int lottery = lottery1 + lottery2 * 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your lottery pick (two digits): ");
        int pick = scanner.nextInt();

        int pick1 = pick % 10;
        int pick2 = (pick / 10) % 10;
        boolean match1 = (pick1 == lottery1) || (pick1 == lottery2);
        boolean match2 = (pick2 == lottery1) || (pick2 == lottery2);
        if (pick == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if (match1 && match2) {
            System.out.println("Match all digits: you win $3,000");
        } else if (match1 || match2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
