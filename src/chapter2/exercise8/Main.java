package chapter2.exercise8;

import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = scanner.nextInt();

        ZoneOffset zoneOffset = ZoneOffset.ofHours(offset);
        OffsetTime current = OffsetTime.now(zoneOffset);
        System.out.println("The current time is " + current.getHour() + ":" + current.getMinute() + ":" + current.getSecond());
    }
}
