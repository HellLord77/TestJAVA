package chapter4.exercise17;

import java.util.Scanner;

public class Main {
    public static int arrayFind(String[] arr, String ele) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx].equals(ele)) {
                return idx;
            }
        }
        return -1;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        int[] dayCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.print("Enter a month: ");
        String month = scanner.nextLine();

        int monthIndex = arrayFind(months, month);
        int day = dayCount[monthIndex];
        if (monthIndex == 1 && isLeapYear(year)) {
            ++day;
        }
        System.out.printf("%s %d has %d day%n", month, year, day);
    }
}
