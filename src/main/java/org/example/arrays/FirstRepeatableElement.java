package org.example.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatableElement {
    public static int findFirstElement(int[] arr){
       Set<Integer> set = new HashSet<>();
       for (int i : arr){
           if (!set.add(i)){
               return i;
           }
       }
       return 0;
    }


    public static int findUniqElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("Unique element not found");
    }


    //сработает если четное кол-во повторяющихся элементов
//    public static int findUniqElement(int[] arr) {
//        int uniq = 0;
//        for (int i : arr){
//            uniq ^= i;
//        }
//        return uniq;
//    }
}
