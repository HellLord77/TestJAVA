package chapter5.exercise4;

public class Main {
    public static void main(String[] args) {
        double multiplier = 1.609;

        System.out.println("Miles\tKilometers");
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d\t\t%.3f%n", i, multiplier * i);
        }
    }
}
