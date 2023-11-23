package org.example.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleTest {

    @Test
    void isDivisible() {
        assertFalse(Divisible.isDivisible(3, 3, 4));
        assertTrue(Divisible.isDivisible(12, 3, 4));
        assertFalse(Divisible.isDivisible(8, 3, 4, 2, 5));
    }
}