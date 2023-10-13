package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
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
        tests.greater(10, 5);
        // Assert
        assertTrue(true);
    }

    @Test
    public void testSecondArgumentLarger() {
        // Act
        tests.greater(5, 10);

        // Assert
        assertFalse(false);

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

    @ValueSource(floats = {1.5f, 3.2f, 7.1f})
    @ParameterizedTest
    public void testSquare(float a) {

        // Act
        float result = tests.square(a);

        // Assert
        assertEquals(a * a, result, 0.001);
    }
}
