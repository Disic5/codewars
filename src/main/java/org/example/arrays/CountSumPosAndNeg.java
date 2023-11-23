package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java
 * Возвращает массив, где первый элемент — это количество положительных чисел, а второй элемент — сумма отрицательных чисел. 0 не является ни положительным, ни отрицательным.
 * Если входные данные представляют собой пустой массив или имеют значение NULL, верните пустой массив.
 */
public class CountSumPosAndNeg {

    public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int count = 0, sum = 0;
        for (int i : input) {
            if (i > 0) count++;
            if (i < 0) sum += i;
        }
        return new int[]{count, sum};
    }

//    public static int[] countPositivesSumNegatives(int[] input) {
//        return input == null || input.length == 0 ?
//                new int[0] :
//                new int[]{(int) IntStream.of(input).filter(i -> i > 0).count(), IntStream.of(input).filter(i -> i < 0).sum()};
//    }


//    public static int[] countPositivesSumNegatives(int[] input) {
//        if (input==null || input.length == 0) {
//            return new int[]{};
//        }
//        int count = (int) Arrays.stream(input).filter(i -> i > 0).count();
//        int sum = Arrays.stream(input).filter(i -> i < 0).sum();
//        return new int[]{count,sum};
//    }


}
