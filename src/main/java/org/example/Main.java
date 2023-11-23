package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.arrayDiff(new int[]{1, 2, 34, 2, 2, 4, 2, 3, 4, 3, 2, 45}, new int[]{2,45});
    }

//    public static int[] arrayDiff(int[] a, int[] b) {
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < a.length; i++) {
//            int count = 0;
//            for (int j = 0; j < b.length; j++) {
//                if (a[i] == b[j]){
//                    count ++;
//                    break;
//                }
//            }
//            if (count == 0){
//                list.add(a[i]);
//            }
//        }
//        System.out.println(list);
//        return list.stream().mapToInt(i -> i).toArray();
//    }

public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
    List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
    listA.removeAll(listB);
    return listA.stream().mapToInt(e -> e).toArray();
}


}
