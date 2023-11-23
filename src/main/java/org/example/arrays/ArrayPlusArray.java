package org.example.arrays;
import java.util.stream.IntStream;

/**
 сумма двух массивов
 */
public class ArrayPlusArray {

//    public static int arrayPlusArray(int[] arr1, int[] arr2) {
//        // arr1 + arr2 is not working...
//        int sum = 0;
//        for (int i : arr1){
//            sum += i;
//        }
//
//        for (int j : arr2){
//            sum += j;
//        }
//
//        return sum;
//    }


    public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sum();
    }
}
