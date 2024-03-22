package org.example.arrays;

import java.util.Arrays;

public class SumArray {
    public static int sum(int[] numbers) {

        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }
        int max, min, sum;
        sum = min = max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        return sum - min - max;
    }



//        public static int sumArray(int[] arr){
//        if (arr == null || arr.length == 0){
//            return 0;
//        }
//        return Arrays.stream(arr).sum();
//    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}