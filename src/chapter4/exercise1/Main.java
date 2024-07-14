package chapter4.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r = scanner.nextDouble();

        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f%n", area);
    }
}
