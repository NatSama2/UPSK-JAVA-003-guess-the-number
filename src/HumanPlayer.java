package src;

import java.util.Scanner;

public class HumanPlayer extends Player {


  public static final String PURPLE_BACKGROUND = "\033[45m";
  public static final String CYAN_BOLD = "\033[1;36m";
  // public static final String CYAN_TEXT = "\033[0;36m";
  public static final String WHITE_BOLD = "\033[1;37m"; 
  public static final String YELLOW_TEXT = "\033[0;33m";
  public static final String RESET_COLOR = "\u001B[0m";

  private Scanner scanner;

  public HumanPlayer() {
    this.scanner = new Scanner(System.in);
  }

  // Ingresar nombre del jugador
  public void enterName() {
    System.out.print(PURPLE_BACKGROUND + "Enter your name: " + RESET_COLOR);
    String playerName = scanner.nextLine();

    setName(CYAN_BOLD + playerName + RESET_COLOR);

    System.out.println(YELLOW_TEXT + "Hello, " + RESET_COLOR + getName() + YELLOW_TEXT + " !Let's play!" + RESET_COLOR);
  }
  
  // Ingresar número
  @Override
  public int makeGuess() {
    System.out.print(WHITE_BOLD + "Enter a number between 1 and 100: " + RESET_COLOR);
    int userGuess = scanner.nextInt();

    System.out.println("You entered: " + userGuess);

    return userGuess;
  }

  // Cerrar el Scanner cuando sea necesario
  public void closeScanner() {
    scanner.close();
  }
}