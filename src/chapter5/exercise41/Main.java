package chapter5.exercise41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String numbersString = scanner.nextLine();

        String[] parts = numbersString.split(" ");
        int[] numbers = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            numbers[index] = Integer.parseInt(parts[index]);
        }

        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int number : numbers) {
            if (number == max) {
                ++count;
            } else if (number > max) {
                max = number;
                count = 1;
            }
        }

        System.out.printf("The largest number is %d%n", max);
        System.out.printf("The occurrence count of the largest number is %d%n", count);
    }
}
