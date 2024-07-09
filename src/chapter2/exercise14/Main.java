package chapter2.exercise14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pound = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double inch = scanner.nextDouble();

        double kilogram = pound * 0.45359237;
        double meter = inch * 0.0254;
        double BMI = kilogram / (meter * meter);
        System.out.println("BMI is " + BMI);
    }
}
