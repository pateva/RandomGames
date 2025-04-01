package org.example.games;

import org.example.utils.Constants;
import org.example.utils.HangmanState;

import static org.example.utils.Constants.GUESSES_WORD;
import static org.example.utils.Constants.YOUR_LETTER_REPLACEMENT;
import static org.example.utils.Constants.YOUR_WORD;

public class Hangman {
    private String word;
    private HangmanState hangmanState;
    private Character[] guessedWord;

    public Hangman() {
        this.word = Constants.WORDS[(int) (Math.random() * Constants.WORDS.length)];
        this.setGuessedWord();
        hangmanState = HangmanState.STAGE0;

        System.out.println(YOUR_WORD);
        this.printGuessedWord();
    }

    public HangmanState getHangmanState() {
        return hangmanState;
    }

    public boolean isWordGuessed() {
        for (Character character : guessedWord) {
            if (character == YOUR_LETTER_REPLACEMENT) {
                return false;
            }
        }

        System.out.println(GUESSES_WORD);
        return true;
    }

    public void getAnotherWord() {
        this.word = Constants.WORDS[(int) (Math.random() * Constants.WORDS.length)];
        hangmanState = HangmanState.STAGE0;
        this.setGuessedWord();

        System.out.println(YOUR_WORD);
        this.printGuessedWord();
    }

    public void guessLetter(Character letter) {
        if(word.contains(letter.toString())) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    guessedWord[i] = letter;
                }
            }
            this.printGuessedWord();
        } else {
            hangmanState = hangmanState.next();
            hangmanState.draw();
            this.printGuessedWord();
        }
    }

    private void setGuessedWord() {
        this.guessedWord = new Character[word.length()];
        this.guessedWord[0] = word.charAt(0);
        this.guessedWord[word.length()-1] = word.charAt(word.length()-1);

        for (int i = 1; i < word.length()-1; i++) {
            guessedWord[i] = YOUR_LETTER_REPLACEMENT;
        }
    }

    private void printGuessedWord() {
        for (Character character : guessedWord) {
            System.out.print(character);
        }

        System.out.println();
    }
}
