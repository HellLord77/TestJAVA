package chapter5.exercise19;

public class Main {
    public static void main(String[] args) {
        int num = 8;

        for (int i = 1; i <= num; ++i) {
            for (int j = 4 * (num - i); j > 0; --j) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; ++j) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }
            for (int j = i - 2; j >= 0; --j) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }
            System.out.println();
        }
    }
}
