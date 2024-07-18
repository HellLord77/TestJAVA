package chapter5.exercise29;

import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        int[] dayCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        String dayLine = "";
        for (String dayName : days) {
            dayLine += "%s\t\t".formatted(dayName);
        }
        for (int month = 0; month < months.length; ++month) {
            System.out.println();
            System.out.printf("                  %s %d%n", months[month], year);
            System.out.println("---------------------------------------------------");
            System.out.println(dayLine);
            int dayCountMonth = dayCount[month];
            if (month == 1 && isLeapYear(year)) {
                ++dayCountMonth;
            }
            for (int i = 0; i < day; ++i) {
                System.out.print("\t\t");
            }
            int count = 1 + day;
            for (int dayMonth = 1; dayMonth <= dayCountMonth; ++dayMonth) {
                System.out.printf("%3d", dayMonth);
                if (count % days.length == 0 && dayMonth != dayCountMonth) {
                    System.out.println();
                } else {
                    System.out.print("\t\t");
                }
                ++count;
            }
            System.out.println();
            day += dayCountMonth;
            day %= days.length;
        }
    }
}
