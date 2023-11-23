package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> collect = new ArrayList<>();
        for (int i = 0; i <arr.length; i++) {
            if (i % 2 == 0){
                collect.add(arr[i]);
            }
        }
        return collect.toArray();
    }

}
