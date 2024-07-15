package chapter5.exercise3;

public class Main {
    public static void main(String[] args) {
        double multiplier = 2.2;

        System.out.println("Kilograms\tPounds");
        for (int i = 1; i < 200; i += 2) {
            System.out.printf("%d\t\t\t%6.1f%n", i, multiplier * i);
        }
    }
}
