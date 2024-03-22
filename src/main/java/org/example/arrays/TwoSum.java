package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumIndex(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int target = sum - curr;
            if (map.containsKey(target)) {
                return new int[]{map.get(curr), i};
            } else {
                map.put(curr, i);
            }
        }
        return null;
    }

    public static int[] twoSum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int target = sum - curr;
            if (map.containsKey(target)) {
                return new int[]{target, curr};
            } else {
                map.put(curr, i);
            }
        }
        return null;
    }


}




