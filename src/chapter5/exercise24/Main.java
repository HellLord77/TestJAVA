package chapter5.exercise24;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1; i <= 97; ++i) {
            sum += i / (i + 2);
        }
        System.out.printf("Sum: %f%n", sum);
    }
}
