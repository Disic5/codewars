package org.example.arrays;

import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 * Напишите функцию, объединяющую два отсортированных массива в один.
 * Массивы содержат только целые числа. Кроме того, конечный результат должен быть отсортирован и не иметь дубликатов.
 */
public class MergingSortedArrays {

    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first), IntStream.of(second)).distinct().sorted().toArray();
    }
//    public static int[] mergeArrays(int[] first, int[] second) {
//        TreeSet<Integer>treeSet = new TreeSet<>();
//        for (int a : first) treeSet.add(a);
//        for (int b : second) treeSet.add(b);
//        return treeSet.stream().mapToInt(i->i).toArray();
//    }
}
