package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolverTest {

    Solver quadraticEquations;

    @BeforeEach
    void setup() {
        quadraticEquations = new Solver();
    }

    @ParameterizedTest
    @CsvSource({"3, 7, 10, 0", "6, 12, 18, 0", "1000, 200, 69, 0"})
    public void testNumberOfRootsWithPositiveNumbers(int a, int b, int c, int expected) {

        // Act
        int result = quadraticEquations.numberOfRoots(a, b, c);

        //Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"-300, -750, -10, 2", "-600, -750, -18, 2", "-1000, -200, -3, 2"})
    public void testNumberOfRootsWithNegativeNumbers(int a, int b, int c, int expected) {

        // Act
        int result = quadraticEquations.numberOfRoots(a, b, c);

        //Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"-1000, 6, -10, 0", "13, -750, 9, 2", "16, -8, 1, 1"})
    public void testNumberOfRootsWithPositiveAndNegativeNumbers(int a, int b, int c, int expected) {

        // Act
        int result = quadraticEquations.numberOfRoots(a, b, c);

        //Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"6, 0, 10, 0", "13, 5, 0, 2", "1, 0, 7, 0"})
    public void testNumberOfRootsWithPositiveNumbersAndZero(int a, int b, int c, int expected) {

        // Act
        int result = quadraticEquations.numberOfRoots(a, b, c);

        //Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"-15, 0, -20, 0", "-150, -1000, 0, 2", "-3, 0, -8, 0"})
    public void testNumberOfRootsWithNegativeNumbersAndZero(int a, int b, int c, int expected) {

        // Act
        int result = quadraticEquations.numberOfRoots(a, b, c);

        //Assert
        assertEquals(expected, result);
    }

}
