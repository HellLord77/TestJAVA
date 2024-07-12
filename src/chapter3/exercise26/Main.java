package chapter3.exercise26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean div5 = number % 5 == 0;
        boolean div6 = number % 6 == 0;

        System.out.println("Is 10 divisible by 5 and 6? " + (div5 && div6));
        System.out.println("Is 10 divisible by 5 or 6? " + (div5 || div6));
        System.out.println("Is 10 divisible by 5 or 6, but not both? " + (div5 ^ div6));
    }
}