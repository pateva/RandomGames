package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);

        do {
            runner.hangmanRunner();
            playAgain = playAgain(scanner);

        } while (playAgain);

        scanner.close();
    }

    private static boolean playAgain(Scanner scanner) {
        System.out.println("Do you want to play again? (yes/no)");
        String response = scanner.nextLine();
        return response.equalsIgnoreCase("yes");
    }
}