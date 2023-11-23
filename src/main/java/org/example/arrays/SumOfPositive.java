package org.example.arrays;

import java.util.Arrays;

/**
 Вы получаете массив чисел, возвращаете сумму всех положительных чисел.
 Пример [1,-4,7,12] => 1 + 7 + 12 = 20
 Примечание. Если суммировать нечего, сумма по умолчанию равна 0.
 */
public class SumOfPositive {

    public static int sum(int[] arr){
       return Arrays.stream(arr).filter(i -> i>0).sum();
    }

//    public static int sum(int[] arr){
//        int sum = 0;
//        for (int i : arr){
//            if (i>0){
//                sum+=i;
//            }
//        }
//        return sum;
//    }
}
