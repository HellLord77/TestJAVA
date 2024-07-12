package chapter3.exercise28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double w1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double w2 = scanner.nextDouble();
        double h2 = scanner.nextDouble();

        double hw1 = w1 / 2;
        double hh1 = h1 / 2;
        double hw2 = w2 / 2;
        double hh2 = h2 / 2;

        double sl1 = x1 - hw1;
        double st1 = y1 + hh1;
        double sr1 = x1 + hw1;
        double sb1 = y1 - hh1;

        double sl2 = x2 - hw2;
        double st2 = y2 + hh2;
        double sr2 = x2 + hw2;
        double sb2 = y2 - hh2;

        if (sl1 <= sl2 && st1 >= st2 && sr1 >= sr2 && sb1 <= sb2) {
            System.out.println("r1 is inside r2");
        } else if (sl1 <= sr2 && st1 >= sb2 && sr1 >= sl2 && sb1 <= st2) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}