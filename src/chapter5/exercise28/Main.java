package chapter5.exercise28;

import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        int[] dayCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        for (int month = 0; month < months.length; ++month) {
            System.out.printf("%s 1, %d is %s%n", months[month], year, days[day]);
            day += dayCount[month];
            if (month == 1 && isLeapYear(year)) {
                ++day;
            }
            day %= days.length;
        }
    }
}
