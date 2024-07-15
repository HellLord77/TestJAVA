package chapter5.exercise17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; ++i) {
            for (int j = 3 * (num - i); j > 0; --j) {
                System.out.print(' ');
            }
            for (int j = i; j >= 2; --j) {
                System.out.printf("%3d", j);
            }
            for (int j = 1; j <= i; ++j) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }
}
