package chapter4.exercise25;

public class Main {
    public static void main(String[] args) {
        System.out.print("Plate number: ");
        for (int i = 0; i < 3; i++) {
            System.out.print((char) ('A' + (int) (Math.random() * 26)));
        }
        for (int i = 0; i < 4; i++) {
            System.out.print((int) (Math.random() * 10));
        }
    }
}
