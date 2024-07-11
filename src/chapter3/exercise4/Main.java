package chapter3.exercise4;

public class Main {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int month = (int) (System.currentTimeMillis() % 12) + 1;
        System.out.println("Month " + month + ": " + months[month - 1]);
    }
}
