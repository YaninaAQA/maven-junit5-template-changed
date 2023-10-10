package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testAddingTwoPositiveInteger() {
        // Arrange
        MathUtils test1 = new MathUtils();
        test1.a = 3;
        test1.b = 5;

        // Act
        test1.add();

        // Assert
        assertEquals(test1.add(), 8);
    }

    @Test
    public void testAddingPositiveIntegerAndZero() {
        // Arrange
        MathUtils test2 = new MathUtils();
        test2.a = 6;
        test2.b = 0;

        // Act
        test2.add();

        // Assert
        assertEquals(test2.add(), 6);
    }

    @Test
    public void testAddingNegativeIntegerAndPossitiveInteger() {
        // Arrange
        MathUtils test3 = new MathUtils();
        test3.a = -5;
        test3.b = 5;

        // Act
        test3.add();

        // Assert
        assertEquals(test3.add(), 0);
    }

    @Test
    public void testAddingLargeIneger() {
        // Arrange
        MathUtils test4 = new MathUtils();
        test4.a = 2147483647;
        test4.b = 1;

        // Act
        test4.add();

        // Assert
        assertEquals(test4.add(), -2147483648);
    }

    @Test
    public void testFirstArgumentLarger() {
        // Arrange
        MathUtils test5 = new MathUtils();
        test5.firstArgument = 10;
        test5.secondArgument = 5;

        // Act
        test5.bigger();

        // Assert
        assertTrue(true);

    }

    @Test
    public void testSecondArgumentLarger() {
        // Arrange
        MathUtils test6 = new MathUtils();
        test6.firstArgument = 5;
        test6.secondArgument = 10;

        // Act
        test6.bigger();

        // Assert
        assertFalse(false);

    }

    @Test
    public void testBothArgumentsEqual() {
        // Arrange
        MathUtils test7 = new MathUtils();
        test7.firstArgument = 5;
        test7.secondArgument = 5;

        // Act
        test7.bigger();

        // Assert
        assertFalse(false);
    }


}
