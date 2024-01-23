package src;

import java.util.Random;

public class ComputerPlayer extends Player {

  Random random = new Random();

  @Override
  public int makeGuess() {
      return random.nextInt(100) + 1;
  }
}
