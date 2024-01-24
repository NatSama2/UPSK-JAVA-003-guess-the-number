package src;

import java.util.Random;

public class ComputerPlayer extends Player {

    private Random random;

    public ComputerPlayer() {
        this.random = new Random();
    }

    @Override
    public int makeGuess() {
        int computerGuess = random.nextInt(100) + 1;
        System.out.println("Computer guessed: " + computerGuess);
        getGuesses().add(computerGuess);
        return computerGuess;
    }


    public void closeScanner() {

    }
}