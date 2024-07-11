package chapter3.exercise4;

public class Main {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int month = (int) (Math.random() * 12) + 1;
        System.out.println("Month " + month + ": " + months[month - 1]);
    }
}
