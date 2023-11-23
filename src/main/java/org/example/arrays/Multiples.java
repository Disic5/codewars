package org.example.arrays;

import java.util.stream.IntStream;

/**
 * В этом простом упражнении вы создадите программу,
 * которая принимает Integer и возвращает список его кратных значений до другого значения предела.
 * Если limit кратен Integer, его также следует включить.
 * В функцию будут передаваться только положительные целые числа, не состоящие из 0.
 * Предел всегда будет выше базового.
 */
public class Multiples {
//        public static int[] find(int base, int limit) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = base; i <= limit; i++) {
//            if (i % base == 0) {
//                list.add(i);
//            }
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
    public static int[] find(int base, int limit) {
        return IntStream.iterate(base, i -> i <= limit, i -> i + base).toArray();
    }
}
