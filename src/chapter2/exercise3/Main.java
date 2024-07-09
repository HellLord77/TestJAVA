package chapter2.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double foot = scanner.nextDouble();

        double meter = foot * 0.305;
        System.out.println(foot + " feet is " + meter + " meters");
    }
}
