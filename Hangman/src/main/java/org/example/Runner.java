package org.example;

import org.example.games.Hangman;
import org.example.utils.HangmanState;

import java.util.Scanner;

import static org.example.utils.Constants.GET_ANOTHER_WORD;
import static org.example.utils.Constants.GUESS_A_LETTER;

public class Runner {
    public void hangmanRunner() {
        Hangman hangman = new Hangman();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(GUESS_A_LETTER);
            String guess = scanner.next();

            if (guess.equalsIgnoreCase(GET_ANOTHER_WORD )) {
                hangman.getAnotherWord();
                continue;
            }

            char letter = guess.charAt(0);
            hangman.guessLetter(letter);

        } while (!hangman.isWordGuessed()
                && hangman.getHangmanState().getStage() < HangmanState.STAGE7.getStage());
    }
}
