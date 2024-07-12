package chapter3.exercise33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        int w1 = scanner.nextInt();
        double p1 = scanner.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        int w2 = scanner.nextInt();
        double p2 = scanner.nextDouble();

        double c1 = w1 / p1;
        double c2 = w2 / p2;
        if (c1 == c2) {
            System.out.println("Two packages have the same price.");
        } else {
            System.out.println("Package " + (c1 > c2 ? 1 : 2) + " has a better price.");
        }
    }
}