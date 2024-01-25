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
    System.out.println(" " + RED_COLOR );
    System.out.println("******************************************************" + RED_COLOR);
    System.out.println("*                                                    *" + RED_COLOR);
    System.out.println("*               Welcome to GuessTheNumber            *" + RED_COLOR);
    System.out.println("*                       Game                         *" + RED_COLOR);
    System.out.println("*                                                    *" + RED_COLOR);
    System.out.println("******************************************************" + RED_COLOR);
    System.out.print(RESET_COLOR);
    
        // javac src/GuessTheNumberGame.java
        // java -cp . src.GuessTheNumberGame

        // Generar el número aleatorio
        int randomNumber = generateRandomNumber();
        System.out.println("Random number generated: " + randomNumber);

        // Crear jugadores
        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.enterName();

        ComputerPlayer computerPlayer = new ComputerPlayer();

        // Juego con ambos jugadores
        playGame(randomNumber, humanPlayer, computerPlayer);

        // Mostrar la historia de suposiciones al final del juego
        displayGuessHistory(humanPlayer);
        // displayGuessHistory(computerPlayer);
    }

    private static void playGame(int targetNumber, Player player1, Player player2) {
        while (true) {
            // Turno del primer jugador
            int guess1 = player1.makeGuess();
            player1.getGuesses().add(guess1);

            if (guess1 == targetNumber) {
                System.out.println(YELLOW_BOLD + "Congratulations, " + RESET_COLOR + player1.getName() + YELLOW_BOLD + " !You guessed the number!" + RESET_COLOR);
                break;
            } else if (guess1 < targetNumber) {
                System.out.println("Too " + GREEN_BOLD + "low! " + RESET_COLOR + player1.getName() + ", try again.");
            } else {
                System.out.println("Too " + RED_BOLD + "high! " + RESET_COLOR + player1.getName() + ", try again.");
            }

            // Turno del segundo jugador
            int guess2 = player2.makeGuess();
            player2.getGuesses().add(guess2);

            if (guess2 == targetNumber) {
                System.out.println(YELLOW_BOLD + "Congratulations, " + RESET_COLOR + "Computer Player" + YELLOW_BOLD + " !You guessed the number!" + RESET_COLOR);
                break;
            } else if (guess2 < targetNumber) {
                System.out.println("Too " + GREEN_BOLD + "low! " + RESET_COLOR + "Computer Player" + ", try again.");
            } else {
                System.out.println("Too " + RED_BOLD + "high! " + RESET_COLOR + "Computer Player" + ", try again.");
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