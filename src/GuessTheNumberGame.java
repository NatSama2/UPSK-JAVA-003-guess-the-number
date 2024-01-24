package src;

import java.util.Random;

public class GuessTheNumberGame {
  
  public static final String RED_COLOR = "\u001B[31m";
  public static final String GREEN_BOLD = "\033[1;32m";
  public static final String RED_BOLD = "\033[1;31m"; 
  public static final String YELLOW_BOLD = "\033[1;33m";
  public static final String RESET_COLOR = "\u001B[0m";

  // Generando el número aleatorio
  public static int generateRandomNumber() {
    Random random = new Random();
    return random.nextInt(100) + 1;
  }

  public static void main(String[] args) {
    System.out.println(" " + RED_COLOR);
    System.out.println("******************************************************" + RED_COLOR);
    System.out.println("*                                                    *" + RED_COLOR);
    System.out.println("*               Welcome to GuessTheNumber            *" + RED_COLOR);
    System.out.println("*                       Game                         *" + RED_COLOR);
    System.out.println("*                                                    *" + RED_COLOR);
    System.out.println("******************************************************" + RED_COLOR);
    System.out.print(RESET_COLOR);
    
        // javac src/GuessTheNumberGame.java
        // java -cp . src.GuessTheNumberGame

        // Se muestra el número aleatorio generado
        int randomNumber = generateRandomNumber();
        System.out.println("Random number generated: " + randomNumber);

        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.enterName();

        // Juego para un solo jugador
        playGameSoloPlayer(randomNumber, humanPlayer);
    }

    private static void playGameSoloPlayer(int targetNumber, Player player) {
        while (true) {
            int guess = player.makeGuess();
            player.getGuesses().add(guess);

            if (guess < targetNumber) {
                System.out.println("Too " + GREEN_BOLD + "low!" + RESET_COLOR + " Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too " + RED_BOLD + "high!" + RESET_COLOR + " Try again.");
            } else {
                System.out.println(YELLOW_BOLD + "Congratulations, " + RESET_COLOR + player.getName() + YELLOW_BOLD + "! You guessed the number!" + RESET_COLOR);
                displayGuessHistory(player);
                break;
            }
        }
    }

    private static void displayGuessHistory(Player player) {
        System.out.println(player.getName() + "'s guess history:");
        for (int guess : player.getGuesses()) {
            System.out.print(guess + " ");
        }
        System.out.println();
    }
}