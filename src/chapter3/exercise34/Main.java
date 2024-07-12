package chapter3.exercise34;

import java.util.Scanner;

public class Main {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

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

        boolean onLine = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
        double d = getDistance(x0, y0, x1, y1);
        double d0 = getDistance(x0, y0, x2, y2);
        double d1 = getDistance(x1, y1, x2, y2);
        boolean inSegment = onLine && d0 <= d && d1 <= d;
        System.out.print(getString(x2, y2) + " is " + (inSegment ? "" : "not ") + "on the line segment from " + getString(x0, y0) + " to " + getString(x1, y1));
    }
}