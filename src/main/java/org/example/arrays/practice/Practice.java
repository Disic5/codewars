package org.example.arrays.practice;

import java.util.HashSet;
import java.util.Set;

public class Practice {
   public static int getUniqNum(int[] arr){
       Set<Integer>set = new HashSet<>();
       return set.stream().mapToInt(Integer::intValue).findFirst().getAsInt();
   }
}
