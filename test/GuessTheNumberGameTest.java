package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import src.GuessTheNumberGame;
import src.Player;

// java -cp "lib/junit-platform-console-standalone-1.10.1.jar;$(pwd)\src;$(pwd)\test" org.junit.platform.console.ConsoleLauncher --scan-classpath


public class GuessTheNumberGameTest {

    @Test
    public void testGenerateRandomNumber() {
        int randomNumber = GuessTheNumberGame.generateRandomNumber();
        assertTrue(randomNumber >= 1 && randomNumber <= 100);
    }
}

