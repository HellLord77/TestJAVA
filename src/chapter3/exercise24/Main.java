package chapter3.exercise24;

public class Main {
    public static void main(String[] args) {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        String rank = ranks[(int) (Math.random() * ranks.length)];
        String suit = suits[(int) (Math.random() * suits.length)];

        System.out.println("The card you picked is " + rank + " of " + suit);
    }
}