package chapter2.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pound = scanner.nextDouble();

        double kilogram = pound * 0.454;
        System.out.println(pound + " pounds is " + kilogram + " kilograms");

    }
}
