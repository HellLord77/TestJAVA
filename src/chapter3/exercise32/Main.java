package chapter3.exercise32;

import java.util.Scanner;

public class Main {
    public static String getString(double x, double y) {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double r = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        System.out.print(getString(x2, y2) + " is on the ");
        if (r != 0) {
            System.out.print((r > 0 ? "left" : "right") + " side of the");
        }
        System.out.println("line from " + getString(x0, y0) + " to " + getString(x1, y1));
    }
}