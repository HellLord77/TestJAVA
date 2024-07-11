package chapter3.exercise17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] terms = {"scissor", "rock", "paper"};

        int term = (int) (Math.random() * 3);

        Scanner scanner = new Scanner(System.in);

        System.out.print(terms[0] + " (0), " + terms[1] + " (1), " + terms[2] + " (2): ");
        int pick = scanner.nextInt();

        boolean equals = pick == term;
        System.out.print("The computer is " + terms[term] + ". You are " + terms[pick] + (equals ? " too" : "") + ". ");
        if (equals) {
            System.out.println("It is a draw");
        } else {
            if ((term + 1) % 3 == pick) {
                System.out.println("You won");
            } else {
                System.out.println("You lost");
            }
        }
    }
}
