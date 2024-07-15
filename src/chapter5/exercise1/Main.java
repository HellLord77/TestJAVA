package chapter5.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;
        double total = 0;
        int current;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        while ((current = scanner.nextInt()) != 0) {
            if (current > 0) {
                ++countPositive;
            } else {
                ++countNegative;
            }
            total += current;
        }
        int count = countPositive + countNegative;
        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.printf("The number of positives is %d%n", countPositive);
            System.out.printf("The number of negatives is %d%n", countNegative);
            System.out.printf("The total is %f%n", total);
            System.out.printf("The average is %f%n", total / count);
        }
    }
}
