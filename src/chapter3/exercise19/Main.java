package chapter3.exercise19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three edges: ");
        double edge1 = scanner.nextDouble();
        double edge2 = scanner.nextDouble();
        double edge3 = scanner.nextDouble();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("Perimeter: " + perimeter);
        } else System.out.println("Invalid input");
    }
}
