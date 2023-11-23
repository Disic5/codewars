package org.example.fundamentals;

import java.util.List;

/**
 * Создайте функцию, которая проверяет,делится ли первый аргумент n на все остальные аргументы
 * (возвратите true, если нет других аргументов)
 * (6,1,3) --> true, потому что 6 делится на 1 и 3
 * (12,2) --> true, потому что 12 делится на 2
 * (100,5,4,10,25,20) --> true,
 * (12,7)--> false, потому что 12 не делится на 7
 */
public class Divisible {
    public static boolean isDivisible(int... array) {
        for (int i = 1; i < array.length; i++) {
            if (array[0] % array[i] != 0) {
                return false;
            }
        }
        return true;
    }

//    public static boolean isDivisible(int n, int... array) {
//        for (int num : array) {
//            if (n % num != 0) {
//                return false;
//            }
//        }
//        return true;
//    }

}
