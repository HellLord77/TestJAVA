package chapter3.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int day = scanner.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = scanner.nextInt();

        String today = days[day];
        String futureDay = days[(day + elapsed) % 7];
        System.out.println("Today is " + today + " and the future day is " + futureDay);
    }
}
