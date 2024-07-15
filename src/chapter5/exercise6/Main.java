package chapter5.exercise6;

public class Main {
    public static void main(String[] args) {
        double multiplier = 1.609;

        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
        for (int i = 1; i <= 10; ++i) {
            int kilometer = 15 + i * 5;
            System.out.printf("%d\t\t%.3f\t\t|\t%d\t\t\t%.3f%n", i, multiplier * i, kilometer, kilometer / multiplier);
        }
    }
}
