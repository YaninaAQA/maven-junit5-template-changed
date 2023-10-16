package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils tests;

    @BeforeEach
    void setup() {
        tests = new MathUtils();
    }

    @Test
    public void testAddingTwoPositiveInteger() {
        // Act
        int result = tests.add(3, 3);

        // Assert
        assertEquals(result, 6);
    }

    @Test
    public void testAddingPositiveIntegerAndZero() {
        // Act
        int result = tests.add(5, 0);

        // Assert
        assertEquals(result, 5);
    }

    @Test
    public void testAddingNegativeIntegerAndPositiveInteger() {
        // Act
        int result = tests.add(-3, 3);

        // Assert
        assertEquals(result, 0);
    }

    @Test
    public void testAddingLargeInteger() {
        // Act

        int result = tests.add(2147483647, 1);

        // Assert
        assertEquals(result, -2147483648);
    }

    @Test
    public void testFirstArgumentLarger() {

        // Act
        boolean result = tests.greater(10, 5);
        // Assert
        assertTrue(result);
    }

    @Test
    public void testSecondArgumentLarger() {
        // Act
        boolean result = tests.greater(5, 10);

        // Assert
        assertFalse(result);

    }

    @Test
    public void testBothArgumentsEqual() {
        // Act
        tests.greater(3, 5);
        // Assert
        assertFalse(false);
    }

    @Test
    public void testDivide() {
        // Act
        float result = tests.divide(5.5f, 3.3f);
        // Assert
        assertEquals(result, 1.66666, 0.001);
    }

    @Test
    public void testMultiple() {
        // Act
        float result = tests.multiple(2.1f, 3.2f);
        // Assert
        assertEquals(result, 6.72, 0.001);
    }

    @ValueSource(floats = {1.5f, 3f, -1.5f})
    @ParameterizedTest
    public void testSquare(float a) {

        // Act
        float result = tests.square(a);

        // Assert
        assertEquals(a * a, result, 0.001);
    }

    @ParameterizedTest
    @CsvSource({"3, 7, 10", "6, 12, 18", "5, -2, 3", "-7, -10, -17"})
    public void testAddWithCsvSource(int a, int b, int expected) {

        // Act
        int result = tests.add(a, b);

        //Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"2.0f, 5.0f, 10.0f", "6.0f, 7.0f, 42.0f", "-3.0f, -2.0f, 6.0f", "-5.0f, 2.0f, -10.0f"})
    public void testMultiplyWithCsvSource(float a, float b, float expected) {

        // Act
        float result = tests.multiple(a, b);

        // Assert
        assertEquals(expected, result);
    }
}
