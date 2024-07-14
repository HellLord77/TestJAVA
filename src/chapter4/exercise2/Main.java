package chapter4.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius = 6371.01;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String[] degrees1 = scanner.nextLine().split(",");
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String[] degrees2 = scanner.nextLine().split(",");

        double x1r = Math.toRadians(Double.parseDouble(degrees1[0].strip()));
        double y1r = Math.toRadians(Double.parseDouble(degrees1[1].strip()));
        double x2r = Math.toRadians(Double.parseDouble(degrees2[0].strip()));
        double y2r = Math.toRadians(Double.parseDouble(degrees2[1].strip()));

        double d = radius * Math.acos(Math.sin(x1r) * Math.sin(x2r) + Math.cos(x1r) * Math.cos(x2r) * Math.cos(y1r - y2r));
        System.out.printf("The distance between the two points is %f km%n", d);
    }
}
