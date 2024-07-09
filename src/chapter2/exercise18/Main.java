package chapter2.exercise18;

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int stop = 5;
        int step = 1;

        System.out.println("a\tb\tpow(a, b)");
        for (int a = start; a <= stop; ++a) {
            int b = a + step;
            System.out.println(a + "\t" + b + "\t" + (int) Math.pow(a, b));
        }
    }
}