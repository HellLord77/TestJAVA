package chapter5.exercise27;

public class Main {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        int count = 1;
        for (int year = 101; year <= 2100; ++year) {
            if (isLeapYear(year)) {
                System.out.printf("%4d", year);
                if (count % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
                ++count;
            }
        }
        System.out.println();
        System.out.printf("Total: %d%n", --count);
    }
}
