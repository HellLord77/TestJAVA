package chapter5.exercise9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of students: ");
        int num = scanner.nextInt();

        int first = 0;
        String firstName = null;
        int second = 0;
        String secondName = null;
        for (int i = 1; i <= num; ++i) {
            System.out.printf("Name of student %d: ", i);
            String name = scanner.next();
            System.out.printf("Score of student %d: ", i);
            int score = scanner.nextInt();
            if (score > first) {
                second = first;
                secondName = firstName;
                first = score;
                firstName = name;
            } else if (score > second) {
                second = score;
                secondName = name;
            }
        }
        System.out.printf("Student with highest score: %s%n", firstName);
        System.out.printf("Student with second-highest score: %s%n", secondName);
    }
}
