package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GravityFlipTest {

    @Test
    void flip() {
        assertArrayEquals(new int[]{ 1,2,2,3 }, GravityFlip.flip('R', new int[]{ 3,2,1,2 }));
        assertArrayEquals(new int[]{ 5,5,4,3,1 }, GravityFlip.flip('L', new int[]{ 1,4,5,3,5 }));
    }
}