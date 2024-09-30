package com.example.assignment.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinMaxFinderObjectTest {

    MinMaxFinder finder = new MinMaxFinder();

    @Test
    void testFindMinMaxObjectWithValidArray() {
        MinMax result = finder.findMinMax(new int[]{56, 34, 7, 3, 54, 3, 34, 34, 53});
        assertEquals(3, result.getMin());
        assertEquals(56, result.getMax());
    }

    @Test
    void testFindMinMaxObjectWithNegativeNumbers() {
        MinMax result = finder.findMinMax(new int[]{-5, -9, -3, -7, -1});
        assertEquals(-9, result.getMin());
        assertEquals(-1, result.getMax());
    }

    @Test
    void testFindMinMaxObjectWithSingleElementArray() {
        MinMax result = finder.findMinMax(new int[]{42});
        assertEquals(42, result.getMin());
        assertEquals(42, result.getMax());
    }
}
