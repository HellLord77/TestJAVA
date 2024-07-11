package chapter3.exercise18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();

        if (weight > 50) {
            System.out.println("Package cannot be shipped");
        } else if (weight <= 0 || weight > 20) {
            System.out.println("Package shipping cost is unknown");
        } else {
            double cost = 0;
            if (weight <= 1) {
                cost = 3.5;
            } else if (weight <= 3) {
                cost = 5.5;
            } else if (weight <= 10) {
                cost = 8.5;
            } else if (weight <= 20) {
                cost = 10.5;
            }
            System.out.println("Package shipping cost: " + cost);
        }
    }
}
