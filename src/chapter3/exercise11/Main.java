package chapter3.exercise11;

import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        int[] dayCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = scanner.nextInt() - 1;

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int day = dayCount[month];
        if (month == 1 && isLeapYear(year)) {
            ++day;
        }
        System.out.println(months[month] + " " + year + " had " + day + " days");
    }
}
