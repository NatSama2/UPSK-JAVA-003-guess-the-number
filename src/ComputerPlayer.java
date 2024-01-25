package src;

import java.util.Random;

public class ComputerPlayer extends Player {

    public static final String WHITE_UNDERLINED = "\033[4;37m";
    public static final String RESET_COLOR = "\u001B[0m";

    private Random random;

    public ComputerPlayer() {
        this.random = new Random();
    }

    @Override
    public int makeGuess() {
        int computerGuess = random.nextInt(100) + 1;
        System.out.println(WHITE_UNDERLINED + "Computer guessed: " + RESET_COLOR + computerGuess);
        getGuesses().add(computerGuess);
        return computerGuess;
    }


    public void closeScanner() {

    }
}