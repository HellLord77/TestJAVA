package chapter5.exercise33;

public class Main {
    public static boolean isPerfect(int num) {
        int end = (int) Math.sqrt(num);
        int sum = 1;
        for (int div = 2; div <= end; ++div) {
            if (num % div == 0) {
                sum += div + num / div;
            }
        }
        if (end == Math.sqrt(num)) {
            sum -= end;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        for (int number = 1; number < 1000; ++number) {
            if (isPerfect(number)) {
                System.out.println(number);
            }
        }
    }
}
