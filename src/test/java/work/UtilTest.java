package work;

import org.junit.jupiter.api.Test;
import work.firstExample.Operation;
import work.firstExample.StringException;
import work.firstExample.Util;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    public void testAdd() {
        assertEquals(2, Util.function(1, 1, Operation.ADD));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, Util.function(6, 3, Operation.SUBTRACT));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, Util.function(2, 2, Operation.MULTIPLY));
    }

    @Test
    public void testDivide() {
        assertEquals(3, Util.function(6, 2, Operation.DIVIDE));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Util.function(6, 0, Operation.DIVIDE);
        });
        String expectedMessage = "Argument 'divisor' is 0";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testAddStrings() {
        assertEquals("64", Util.function("6", "4", Operation.ADD));
    }

    @Test
    public void otherOperationsWithStrings() {
        Exception exception = assertThrows(StringException.class, () -> {
            Util.function("6", "4", Operation.DIVIDE);
        });
        String expectedMessage = "Only concatenation allowed";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }
}