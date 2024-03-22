package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

//    public static Set<Integer> findRepeatElement(int[] arr){
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int num: arr) {
//            map.merge(num, 1, Integer::sum);
//        }
//
//        return map.entrySet().stream().filter(entry -> entry.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toSet());
//    }





    public static Character findUniqChar(String string){
        Map<Character, Integer>map = new HashMap<>();
        for (char ch : string.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }


}
