package org.example.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepeatableNum {
    public static Map<Integer, Integer> countRepeatable(int[] arr){
        return Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                Collectors.collectingAndThen(Collectors.counting(),
                        Long::intValue)));
    }
}
