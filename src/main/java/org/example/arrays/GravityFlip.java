package org.example.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class GravityFlip {
        public static int[] flip(char dir, int[] arr) {
        if (dir == 'R') {
            return Arrays.stream(arr).sorted().toArray();
        } else if (dir == 'L') {
            return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        }
        return null;
    }

}
