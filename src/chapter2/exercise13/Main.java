package chapter2.exercise13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double P = scanner.nextDouble();

        double r = 5.0 / 100 / 12;
        double n = 6;
        double tP = 0;
        for (int i = 0; i < n; i++) {
            tP = (P + tP) * (1 + r);
        }
        System.out.println("After the sixth month, the account value is $" + tP);
    }
}
