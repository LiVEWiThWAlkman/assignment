package com.example.assignment.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exception2Test {

    @Test
    void testDivisionWithValidInput() {
        assertEquals(5, Exception2.divide(10, 2));
        assertEquals(3, Exception2.divide(9, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            Exception2.divide(10, 0);
        });

        String expectedMessage = "Division by zero is not supported.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}