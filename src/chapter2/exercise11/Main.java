package chapter2.exercise11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int year = scanner.nextInt();

        int currentPopulation = 312032486;
        int second = year * 365 * 24 * 60 * 60;
        int birth = second / 7;
        int death = second / 13;
        int migrant = second / 45;
        int population = currentPopulation + birth - death + migrant;
        System.out.println("The population in " + year + " years is " + population);
    }
}
