package chapter4.exercise18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] statuses = {"Freshman", "Sophomore", "Junior", "Senior"};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String characters = input.next();

        char major = characters.charAt(0);
        int status = characters.charAt(1) - '1';

        if ((major != 'M' && major != 'C' && major != 'I') || status < 0 || status > 3) {
            System.out.println("Invalid input");
        } else {
            String majorString = switch (major) {
                case 'M' -> "Mathematics";
                case 'C' -> "Computer Science";
                case 'I' -> "Information Technology";
                default -> "";
            };
            String statusString = statuses[status];
            System.out.printf("%s %s%n", majorString, statusString);
        }
    }
}
