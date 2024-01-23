package src;

import java.util.Random;

public class GuessTheNumberGame {
  
  public static final String RED_COLOR = "\u001B[31m";
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
  }
/* 
  public static void checkGuess(int number) {
    int turn = 0;

    HumanPlayer humanPlayer = new HumanPlayer();
    ComputerPlayer computerPlayer = new ComputerPlayer();

    humanPlayer.enterName();
    // int humanNumberChoose = humanPlayer.makeGuess();
    int computerNumberChoose = computerPlayer.makeGuess();

    // Clean arrays
    humanPlayer.getGuesses().clear();
    computerPlayer.getGuesses().clear();
  }
  */
}