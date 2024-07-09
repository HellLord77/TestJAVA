package chapter2.exercise16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * s * s;
        System.out.println("The area of the hexagon is " + area);
    }
}