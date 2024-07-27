package chapter5.exercise43;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 7; ++i) {
            for (int j = i + 1; j <= 7; ++j) {
                ++count;
                System.out.printf("%d %d%n", i, j);
            }
        }
        System.out.printf("The total number of all combinations is %d%n", count);
    }
}
