package chapter5.exercise12;

public class Main {
    public static void main(String[] args) {
        double n = 0;
        while (n * n <= 12000) {
            ++n;
        }
        System.out.println(n);
    }
}