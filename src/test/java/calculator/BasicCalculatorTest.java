package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();
    @Test
    @DisplayName("Testing Sum: 7 + 10 = 17")
    public void summing() {
        // Arrange
        Long number1 = 7L;
        Long number2 = 10L;
        Long expectedValue = 17L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing Subtract: 10 - 7 = 3")
    public void subtractig() {
        Long number1 = 10L;
        Long number2 = 7L;
        Long expectedValue = 3L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing multiplicar: 10 * 7 = 70")
    public void multiplying() {
        Long number1 = 10L;
        Long number2 = 7L;
        Long expectedValue = 70L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing dividir: 50 / 2 = 25")
    public void dividing() {
        Long number1 = 50L;
        Long number2 = 2L;
        Long expectedValue = 25L;

        // Act
        Long result = basicCalculator.divide(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
}