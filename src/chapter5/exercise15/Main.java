package chapter5.exercise15;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        for (char ch = '!'; ch <= '~'; ch++) {
            System.out.print(ch);
            if (count % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
            ++count;
        }
    }
}
