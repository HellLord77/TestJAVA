package chapter4.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();
        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();

        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        System.out.printf("The area of the polygon is %f%n", area);
    }
}
