package chapter5.exercise34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] terms = {"scissor", "rock", "paper"};

        Scanner scanner = new Scanner(System.in);

        int scorePlayer = 0;
        int scoreComputer = 0;

        while (Math.abs(scorePlayer - scoreComputer) <= 2) {
            System.out.print(terms[0] + " (0), " + terms[1] + " (1), " + terms[2] + " (2): ");
            int pickPlayer = scanner.nextInt();

            int pickComputer = (int) (Math.random() * terms.length);
            boolean equals = pickPlayer == pickComputer;
            System.out.print("The computer is " + terms[pickComputer] + ". You are " + terms[pickPlayer] + (equals ? " too" : "") + ". ");
            if (equals) {
                System.out.println("It is a draw");
            } else {
                if ((pickComputer + 1) % 3 == pickPlayer) {
                    ++scorePlayer;
                    System.out.println("You won");
                } else {
                    ++scoreComputer;
                    System.out.println("You lost");
                }
            }
        }

        if (scorePlayer > scoreComputer) {
            System.out.println("You are the winner");
        } else {
            System.out.println("You are the looser");
        }
    }
}
