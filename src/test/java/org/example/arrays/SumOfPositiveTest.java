package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPositiveTest {

    @Test
    void sumTest() {
        assertEquals(15, SumOfPositive.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, SumOfPositive.sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, SumOfPositive.sum(new int[]{}));
        assertEquals(0, SumOfPositive.sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, SumOfPositive.sum(new int[]{-1, 2, 3, 4, -5}));
    }

}