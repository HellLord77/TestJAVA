package chapter2.exercise12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double v = scanner.nextDouble();
        double a = scanner.nextDouble();

        double length = v * v / (2 * a);
        System.out.println("The minimum runway length for this airplane is " + length);
    }
}
