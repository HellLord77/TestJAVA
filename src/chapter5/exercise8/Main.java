package chapter5.exercise8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of students: ");
        int num = scanner.nextInt();

        int first = 0;
        String firstName = null;
        for (int i = 1; i <= num; i++) {
            System.out.printf("Name of student %d: ", i);
            String name = scanner.next();
            System.out.printf("Score of student %d: ", i);
            int score = scanner.nextInt();
            if (score > first) {
                first = score;
                firstName = name;
            }
        }
        System.out.printf("Student with highest score: %s%n", firstName);
    }
}
