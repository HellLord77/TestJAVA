package chapter5.exercise40;

public class Main {
    public static void main(String[] args) {
        int count = 100000000;

        int countHead = 0;
        for (int i = 0; i < count; ++i) {
            countHead += (int) (Math.random() * 2);
        }

        System.out.printf("Head: %d%n", countHead);
        System.out.printf("Tail: %d%n", count - countHead);
    }
}
