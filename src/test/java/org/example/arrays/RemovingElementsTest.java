package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingElementsTest {

    @Test
    void removeEveryOther() {
        assertArrayEquals(new Object[] { "Hello", "Hello Again" },RemovingElements.removeEveryOther(new Object[] { "Hello", "Goodbye", "Hello Again" }));
        assertArrayEquals(new Object[] { new Object[] { 1, 2 } },RemovingElements.removeEveryOther(new Object[] { new Object[] { 1, 2 } }));
        assertArrayEquals(new Object[] { 1, 3, 5, 7, 9 },RemovingElements.removeEveryOther(new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        assertArrayEquals(new Object[] { "Goodbye" }, RemovingElements.removeEveryOther(new Object[] { "Goodbye" }));
        assertArrayEquals(new Object[] {}, RemovingElements.removeEveryOther(new Object[] {}));
    }
}