package src;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
  
  public static final String RED_COLOR = "\u001B[31m";
  public static final String RESET_COLOR = "\u001B[0m";

  public static int generateRandomNumber() {
    Random random = new Random();
      return random.nextInt(100) +1;
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

    //Se muestra el número random generado
    int randomNumber = generateRandomNumber();
    System.out.println("Random number generated: " + randomNumber);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number between 1 and 100: ");
    int userGuess = scanner.nextInt();

    System.out.println("You entered: " + userGuess);

    scanner.close();

    HumanPlayer humanPlayer = new HumanPlayer();
    ComputerPlayer computerPlayer = new ComputerPlayer();
    
  }

}
