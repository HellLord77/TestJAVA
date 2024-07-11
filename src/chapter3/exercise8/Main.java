package chapter3.exercise8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        Arrays.sort(numbers);
        System.out.println("Integers in non-decreasing order: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}
