package th.nuernberg.testverfahren;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-4, 3));
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(3.0, calc.divide(6, 2));
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        assertEquals("Division by zero!", exception.getMessage());
    }
}
