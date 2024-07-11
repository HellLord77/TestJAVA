package chapter3.exercise15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 1000);
        int lottery1 = lottery % 10;
        int lottery2 = (lottery / 10) % 10;
        int lottery3 = (lottery / 100) % 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your lottery pick (three digits): ");
        int pick = scanner.nextInt();

        int pick1 = pick % 10;
        int pick2 = (pick / 10) % 10;
        int pick3 = (pick / 100) % 10;
        boolean match1 = (pick1 == lottery1) || (pick1 == lottery2) || (pick1 == lottery3);
        boolean match2 = (pick2 == lottery1) || (pick2 == lottery2) || (pick2 == lottery3);
        boolean match3 = (pick3 == lottery1) || (pick3 == lottery2) || (pick3 == lottery3);
        if (pick == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if (match1 && match2 && match3) {
            System.out.println("Match all digits: you win $3,000");
        } else if (match1 || match2 || match3) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
