package work.StrategyExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static work.StrategyExample.Operations.*;

public class StrategyTest {

    private Handler<Comparable> handler = new Handler<>();

    @Test
    public void addIntegersTest() {
        assertEquals(4, handler.function(2, 2, ADD));
    }

    @Test
    public void subtractIntegersTest() {
        assertEquals(4, handler.function(8, 4, SUBTRACT));
    }

    @Test
    public void multiplyIntegersTest() {
        assertEquals(4, handler.function(2, 2, MULTIPLY));
    }

    @Test
    public void divideIntegersTest() {
        assertEquals(4, handler.function(8, 2, DIVIDE));
    }

    @Test
    public void concatStringsTest() {
        assertEquals("64", handler.function("6", "4", ADD));
    }

    @Test
    public void nullParameterTest() {
        Exception exception = assertThrows(RuntimeException.class, () -> handler.function(2, null, MULTIPLY));
        String expectedMessage = "Null as argument";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void divideByZeroTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> handler.function(2, 0, DIVIDE));
        String expectedMessage = "Dividing by zero not allowed";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
