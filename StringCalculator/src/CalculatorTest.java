import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddWithDefaultDelimiter() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1,2,3");
        assertEquals(6, result);
    }

    @Test
    public void testAddWithNewlineDelimiter() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    public void testAddWithCustomDelimiter() {
        Calculator calculator = new Calculator();
        int result = calculator.add("//;\n1;2;3");
        assertEquals(6, result);
    }

    @Test
    public void testAddWithEmptyString() {
        Calculator calculator = new Calculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void testAddWithSingleNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.add("5");
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        calculator.add("1,-2,3,-4,-5");
    }

    @Test
    public void testAddWithNegativeNumbersExceptionMessage() {
        Calculator calculator = new Calculator();
        try {
            calculator.add("1,-2,3,-4,-5");
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("negative numbers not allowed: -2, -4, -5", e.getMessage());
        }
    }

    @Test
    public void testAddWithLargeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1000,1001,2");
        assertEquals(2003, result);
    }

    @Test
    public void testAddWithNumbersExceedingThousand() {
        Calculator calculator = new Calculator();
        int result = calculator.add("2,1001");
        assertEquals(1003, result);
    }
}

