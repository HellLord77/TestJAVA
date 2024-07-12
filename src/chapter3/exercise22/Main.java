package chapter3.exercise22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double d = Math.sqrt(x * x + y * y);
        boolean inCircle = d <= radius;
        System.out.println("Point (" + x + ", " + y + ") is " + (inCircle ? "" : "not ") + "in the circle");
    }
}