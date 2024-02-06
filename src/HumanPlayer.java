package src;

import java.util.Scanner;

public class HumanPlayer extends Player {


  public static final String PURPLE_BACKGROUND = "\033[45m";
  public static final String CYAN_BOLD = "\033[1;36m";
  public static final String RED_BOLD = "\033[1;31m";
  public static final String WHITE_BOLD = "\033[1;37m"; 
  public static final String YELLOW_TEXT = "\033[0;33m";
  public static final String RESET_COLOR = "\u001B[0m";

  private Scanner scanner;

  public HumanPlayer() {
    this.scanner = new Scanner(System.in);
  }

    // Ingresar nombre del jugador
    public void enterName() {
      String playerName;
      do {
          System.out.print(PURPLE_BACKGROUND + "Enter your name: " + RESET_COLOR);
          playerName = scanner.nextLine().trim(); // Trim para eliminar espacios en blanco al principio y al final

          if (playerName.isEmpty()) {
              System.out.println(RED_BOLD + "Please enter a name\n" + RESET_COLOR);
          }

      } while (playerName.isEmpty());

      setName(CYAN_BOLD + playerName + RESET_COLOR);

      System.out.println(YELLOW_TEXT + "Hello, " + RESET_COLOR + getName() + YELLOW_TEXT + " !Let's play!\n" + RESET_COLOR);
  }

  
// Ingresar número
@Override
public int makeGuess() {
    int userGuess;

    do {
        System.out.print(WHITE_BOLD + "Enter a number between 1 and 100: " + RESET_COLOR);

        // Verificar si la entrada es un número
        while (!scanner.hasNextInt()) {
            System.out.println(RED_BOLD + "Please enter a valid number\n" + RESET_COLOR);
            System.out.print(WHITE_BOLD + "Enter a number between 1 and 100: " + RESET_COLOR);
            scanner.next(); // Consumir la entrada no válida
        }

        userGuess = scanner.nextInt();

        // Verificar si el número está en el rango correcto
        if (userGuess < 1 || userGuess > 100) {
            System.out.println(RED_BOLD + "Please enter a valid number\n" + RESET_COLOR);
        }

    } while (userGuess < 1 || userGuess > 100);

    System.out.println("You entered: " + userGuess);

    return userGuess;
}


  // Cerrar el Scanner cuando sea necesario
  public void closeScanner() {
    scanner.close();
  }
}