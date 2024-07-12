package chapter3.exercise21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int y = scanner.nextInt();

        System.out.print("Enter month: 1-12: ");
        int m = scanner.nextInt();

        System.out.print("Enter the day of the month: 1-31: ");
        int q = scanner.nextInt();

        if (m < 3) {
            --y;
            m += 12;
        }
        int j = y / 100;
        int k = y % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        String day = days[h];
        System.out.println("Day of the week is " + day);
    }
}