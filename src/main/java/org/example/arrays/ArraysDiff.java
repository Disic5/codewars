package org.example.arrays;

import org.example.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Ваша цель в этом ката - реализовать функцию разности, которая вычитает один список из другого и возвращает результат.
 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 * <p>
 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */

public class ArraysDiff {
    public static void main(String[] args) {
        Main main = new Main();
        arrayDiff3(new int[]{1, 2, 34, 2, 2, 4, 2, 3, 4, 3, 2, 45}, new int[]{2,45});
    }

    public static int[] arrayDiff1(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                list.add(a[i]);
            }
        }
        System.out.println(list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] arrayDiff2(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }

    public static int[] arrayDiff3(int[] a, int[] b) {
        Set<Integer> setB = Arrays.stream(b).boxed().collect(Collectors.toSet());
       return Arrays.stream(a).filter(x -> !setB.contains(x)).toArray();
    }

}
