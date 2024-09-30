package com.example.assignment.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionHandlerTest {

    @Test
    void testDivisionWithValidInput() {
        assertEquals(5, DivisionHandler.divide(10, 2));
        assertEquals(3, DivisionHandler.divide(9, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            DivisionHandler.divide(10, 0);
        });

        String expectedMessage = "Cannot divide by zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
