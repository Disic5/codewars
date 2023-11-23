package org.example.string;

import org.example.string.CalculateString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateStringTest {

    @Test
    void shiftedDiff() {
        assertEquals(4, CalculateString.shiftedDiff("eecoff","coffee"));
        assertEquals(2, CalculateString.shiftedDiff("coffee","eecoff"));
        assertEquals(-1, CalculateString.shiftedDiff("hoop","pooh"));
        assertEquals(0, CalculateString.shiftedDiff("coffee","coffee"));
        assertEquals(-1, CalculateString.shiftedDiff("Coffee","coffee"));
        assertEquals(5, CalculateString.shiftedDiff("fatigue","tiguefa"));
    }
}