package chapter5.exercise18;

public class Main1 {
    public static void main(String[] args) {
        int num = 6;

        for (int i = 1; i <= num; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
