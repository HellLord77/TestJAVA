package chapter2.exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double M = scanner.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();

        double Q = M * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + Q);
    }
}