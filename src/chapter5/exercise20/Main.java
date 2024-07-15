package chapter5.exercise20;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        int count = 0;

        for (int number = 2; number <= 1000; ++number) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
        }
    }
}
