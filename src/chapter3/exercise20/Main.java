package chapter3.exercise20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double ta = scanner.nextDouble();

        if (ta < -58 || ta > 41) {
            System.out.println("Invalid temperature");
        } else {
            System.out.print("Enter the wind speed (>=2) in miles per hour: ");
            double v = scanner.nextDouble();

            if (v < 2) {
                System.out.println("Invalid wind speed");
            } else {
                double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
                System.out.println("The wind chill index is " + twc);
            }
        }
    }
}