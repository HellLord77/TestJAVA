package chapter6.exercise1;

public class Main {
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        int count = 1;
        for (int num = 1; num <= 100; ++num) {
            System.out.print(getPentagonalNumber(num));
            if (count % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
            ++count;
        }
    }
}
