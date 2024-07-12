package chapter3.exercise27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        boolean inTriangle = x >= 0 && y >= 0 && (y + 0.5 * x - 100 <= 0);
        System.out.println("The point is " + (inTriangle ? "" : "not ") + "in the triangle");
    }
}