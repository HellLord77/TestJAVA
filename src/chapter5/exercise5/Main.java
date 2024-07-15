package chapter5.exercise5;

public class Main {
    public static void main(String[] args) {
        double multiplier = 2.2;

        System.out.println("Kilograms\tPounds\t\t|\t\tPounds\tKilograms");
        for (int i = 1; i < 200; i += 2) {
            int pound = (int) (17.5 + i * 2.5);
            System.out.printf("%d\t\t\t%6.1f\t\t|\t\t%d\t\t\t%5.2f%n", i, multiplier * i, pound, pound / multiplier);
        }
    }
}
