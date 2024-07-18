package chapter5.exercise23;

public class Main {
    public static void main(String[] args) {
        int n = 50000;

        double sumLR = 0;
        for (int i = 1; i <= n; ++i) {
            sumLR += 1.0 / i;
        }
        System.out.println("Sum (Left to Right): " + sumLR);

        double sumRL = 0;
        for (int i = n; i >= 1; --i) {
            sumRL += 1.0 / i;
        }
        System.out.println("Sum (Right to Left): " + sumRL);
    }
}
