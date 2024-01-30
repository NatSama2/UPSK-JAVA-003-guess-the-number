package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;

//import src.ComputerPlayer;
import src.GuessTheNumberGame;
import src.HumanPlayer;
import src.Player;

// java -cp "lib/junit-platform-console-standalone-1.10.1.jar;$(pwd)\src;$(pwd)\test" org.junit.platform.console.ConsoleLauncher --scan-classpath

public class GuessTheNumberGameTest {

    @Test
    public void testGenerateRandomNumber() {
        int randomNumber = GuessTheNumberGame.generateRandomNumber();
        assertTrue(randomNumber >= 1 && randomNumber <= 100);
    }

    @Test
    public void getNameTest() {
        String name = "Jose";
        HumanPlayer humanPlayerMock = mock(HumanPlayer.class);
        when(humanPlayerMock.getName()).thenReturn(name);

        assertEquals(name, humanPlayerMock.getName());
    }

    @Test
    public void testPlayerGuessHigherThanTarget() {
        Player playerMock = mock(Player.class);
        when(playerMock.makeGuess()).thenReturn(75); // Simula un intento mayor al número objetivo
        assertTrue(playerMock.makeGuess() > 50); // Asegura que el número sea mayor que el límite inferior (50)
    }

    @Test
    public void testPlayerGuessLowerThanTarget() {
        Player playerMock = mock(Player.class);
        when(playerMock.makeGuess()).thenReturn(25); // Simula un intento menor al número objetivo
        assertTrue(playerMock.makeGuess() < 50); // Asegura que el número sea menor que el límite superior (50)
    }

    @Test
    public void testPlayerGuessEqualsTarget() {
        Player playerMock = mock(Player.class);
        when(playerMock.makeGuess()).thenReturn(50); // Simula un intento igual al número objetivo
        assertEquals(50, playerMock.makeGuess()); // Asegura que el número sea igual al objetivo
    }


}





