package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTest {
    @Test
    public void testChangeNameSuccessful() {
        // Arrange
        Person man = new Person("Bob", 25);

        // Act
        man.changeName("Mart");

        // Assert
        assertEquals("Mart", man.getName());
    }

    @Test
    public void testCelebrateBirthday() {
        // Arrange
        Person oldman = new Person("Charlie", 35);

        // Act
        oldman.celebrateBirthday();

        // Assert
        assertEquals(oldman.getAge(), 36);

    }


}
