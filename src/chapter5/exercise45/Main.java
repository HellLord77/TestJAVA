package chapter5.exercise45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        String numbersString = scanner.nextLine();

        String[] parts = numbersString.split(" ");
        double[] numbers = new double[parts.length];
        for (int index = 0; index < parts.length; index++) {
            numbers[index] = Double.parseDouble(parts[index]);
        }

        double sum = 0;
        double sumSqr = 0;
        for (double number : numbers) {
            sum += number;
            sumSqr += number * number;
        }
        double mean = sum / numbers.length;
        double deviation = Math.sqrt((sumSqr - (sum * sum / numbers.length)) / (numbers.length - 1));
        System.out.printf("The mean is %.2f%n", mean);
        System.out.printf("The standard deviation is %.5f%n", deviation);
    }
}
