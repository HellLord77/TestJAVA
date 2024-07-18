package chapter5.exercise25;

public class Main {
    public static double getPI(int I) {
        double sum = 0;
        for (int i = 1; i <= I; ++i) {
            sum += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        return 4 * sum;
    }

    public static void main(String[] args) {
        System.out.println("i\t\tpi");
        for (int i = 10000; i <= 100000; i += 10000) {
            System.out.println(i + "\t" + getPI(i));
        }
    }
}
