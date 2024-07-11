package chapter3.exercise14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] faces = {"head", "tail"};

        int face = (int) (Math.random() * 2);

        Scanner scanner = new Scanner(System.in);

        System.out.print(faces[0] + " (1), " + faces[1] + " (2): ");
        int guess = scanner.nextInt() - 1;

        System.out.println("You guessed " + faces[guess] + ".");
        System.out.println("You guess is " + (guess == face ? "in" : "") + "correct!");
    }
}
