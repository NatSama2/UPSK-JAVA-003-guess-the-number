package src;

import java.util.Scanner;

public class HumanPlayer extends Player {
  
  public void enterName() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String playerName = scanner.nextLine();

    setName(playerName);

    System.out.println("Hello, " + getName() + "! Let's play!");
  }

  @Override
  public int makeGuess() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number between 1 and 100: ");
    int userGuess = scanner.nextInt();

    System.out.println("You entered: " + userGuess);

    return userGuess;
  }
  
}