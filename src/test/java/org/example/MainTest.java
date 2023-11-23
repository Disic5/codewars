package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void arrayDiffTest() {
        int[] arr = {1, 2, 34, 2, 2, 4};
        Main main = new Main();
        int[] result = main.arrayDiff(arr, new int[]{1,2});

        assertArrayEquals(new int[]{34, 4}, result);
    }
}