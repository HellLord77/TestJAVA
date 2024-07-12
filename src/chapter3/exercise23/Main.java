package chapter3.exercise23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double width = 10;
        double height = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double halfWidth = width / 2;
        double halfHeight = height / 2;
        boolean inRectangle = -halfWidth <= x && x <= halfWidth && -halfHeight <= y && y <= halfHeight;
        System.out.println("Point (" + x + ", " + y + ") is " + (inRectangle ? "" : "not ") + "in the rectangle");
    }
}