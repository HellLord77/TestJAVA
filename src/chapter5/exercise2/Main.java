package chapter5.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        String output = "";
        Scanner input = new Scanner(System.in);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUMBER_OF_QUESTIONS; ++i) {
            int number1 = 1 + (int) (Math.random() * 15);
            int number2 = 1 + (int) (Math.random() * 15);

            System.out.printf("What is %d + %d? ", number1, number2);
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                ++correctCount;
            } else {
                System.out.println("Your answer is wrong.");
                System.out.printf("%d + %d should be %d%n", number1, number2, number1 + number2);
            }
            output += "\n%d+%d=%d %s".formatted(number1, number2, answer, (number1 + number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();

        long testTime = endTime - startTime;
        System.out.printf("\nCorrect count is %d%n", correctCount);
        System.out.printf("Test time is %d%n", testTime / 1000);
        System.out.println(output);
    }
}
