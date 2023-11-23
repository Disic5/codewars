package org.example.arrays;

import java.util.Arrays;
/**
 Вам будет предоставлен список строк.
 Вы должны отсортировать его в алфавитном порядке (с учетом регистра и на основе значений символов ASCII),
 а затем вернуть первое значение.Возвращаемое значение должно быть строкой и содержать «***» между каждой буквой.
 */
public class SortAndStar {
    public static String twoSort(String[] s) {
        String s1 = Arrays.stream(s).sorted().findFirst().orElse(null);
        return s1 == null || s1.isEmpty() ? null : s1.replaceAll(".(?!$)", "$0***");
    }

//    public static String twoSort(String[] s) {
//        Arrays.sort(s);
//        return String.join("***",s[0].split(""));
//    }

}
