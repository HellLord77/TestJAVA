package chapter4.exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = scanner.nextDouble();

        double angleCenter = 2 * Math.PI / 5;
        double[][] points = new double[5][];
        System.out.println("The coordinates of five points on the pentagon are");
        for (int index = 0; index < points.length; index++) {
            double angle = index * angleCenter;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            System.out.printf("(%f, %f)%n", x, y);
        }
    }
}
