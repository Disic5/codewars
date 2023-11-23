package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPlusArrayTest {

    @Test
    void arrayPlusArrayTests() {
        assertEquals(21, ArrayPlusArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, ArrayPlusArray.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, ArrayPlusArray.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, ArrayPlusArray.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }
}