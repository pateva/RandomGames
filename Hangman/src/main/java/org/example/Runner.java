package org.example;

import org.example.games.Hangman;
import org.example.utils.HangmanState;

import java.util.Scanner;

public class Runner {
    public void hangmanRunner() {
        Hangman hangman = new Hangman();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        do {
            System.out.println("GUESS A LETTER: ");
            String guess = scanner.next();
            char letter = guess.charAt(0);
            hangman.guessLetter(letter);

        } while (!hangman.isWordGuessed() && hangman.getHangmanState().getStage() < HangmanState.STAGE7.getStage());
    }
}
