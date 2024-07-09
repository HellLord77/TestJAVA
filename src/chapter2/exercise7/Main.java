package chapter2.exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minute = scanner.nextInt();

        int year = minute / 60 / 24 / 365;
        int day = (minute / 60 / 24) % 365;
        System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days");
    }
}
