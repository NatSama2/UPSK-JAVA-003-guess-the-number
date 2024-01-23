package src;

public abstract class Player {
  
  private String name;

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  // Método abstracto que debe ser implementado por las clases hijas
  public abstract int makeGuess();

  // Otros métodos comunes a todos los jugadores, si los hay
}
