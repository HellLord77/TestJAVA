package chapter5.exercise11;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        for (int num = 100; num <= 200; ++num) {
            boolean div5 = num % 5 == 0;
            boolean div6 = num % 6 == 0;
            if ((div5 || div6) && !(div5 && div6)) {
                System.out.print(num);
                if (count % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
                ++count;
            }
        }
    }
}
