package chapter5.exercise18;

public class Main2 {
    public static void main(String[] args) {
        int num = 6;

        for (int i = num; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
