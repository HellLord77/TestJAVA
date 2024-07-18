package chapter5.exercise26;

public class Main {
    public static double getE(int I) {
        double e = 1;
        double item = 1;
        for (int i = 1; i <= I; ++i) {
            item /= i;
            e += item;
        }
        return e;
    }

    public static void main(String[] args) {
        System.out.println("i\t\te");
        for (int i = 10000; i <= 100000; i += 10000) {
            System.out.println(i + "\t" + getE(i));
        }
    }
}
