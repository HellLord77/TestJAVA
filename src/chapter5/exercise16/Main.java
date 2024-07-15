package chapter5.exercise16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int div = 2;
        int tmp = num;
        boolean found = false;
        while (tmp != 0 && div < num) {
            if (tmp % div == 0) {
                if (found) {
                    System.out.print(", ");
                }
                System.out.print(div);
                tmp /= div;
                found = true;
            } else {
                ++div;
            }
        }
        if (!found) {
            System.out.printf("1, %d%n", num);
        }
    }
}
