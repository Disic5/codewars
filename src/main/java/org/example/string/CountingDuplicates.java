package org.example.string;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Напишите функцию, которая будет возвращать количество различных буквенных символов и числовых цифр,
 * не зависящих от регистра, которые встречаются во входной строке более одного раза.
 * Можно предположить, что входная строка содержит только буквы алфавита
 * (как прописные, так и строчные) и числовые цифры.
 * https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
 */
public class CountingDuplicates {
    /***
     например слово "aBbbaaC"
     */
    public static int duplicateCount(String text) {
        int count = 0;
//переводим все в lowerCase "abbbaac"
        text = text.toLowerCase();
        //идем по длине строки
        while (text.length() > 0) {
            // берем первый символ, substring возращает строку от заданого индекса и до другого
            // от 0 до 1 получаем 1 символ в нашем случаи, a
            String firstLetter = text.substring(0,1);
            // text = "bbbaac" (строка будет начинаться с 1 индекса) индекс начинается с 0
            text = text.substring(1);
            //условие если в строке "bbbaac" есть символ 'a' тогда count++
            if (text.contains(firstLetter)) {
                count ++;
            }
            //из строки bbbaac заменить символ 'a' на ""
            text = text.replace(firstLetter, "");
            //получиться bbbc
        }
        return count;
    }

//    public static int duplicateCount(String text) {
//        int count = 0;
//        text = text.toLowerCase();
//        while (text.length() > 0) {
//            String firstLetter = text.substring(0, 1);
//            text = text.substring(1);
//            if (text.contains(firstLetter)) {
//                count++;
//            }
//            text = text.replace(firstLetter, "");
//        }
//        return count;
//    }
//    public static int duplicateCount(String text) {
//        Set<Character> set = new HashSet<>();
//        char[] chars = text.toLowerCase().toCharArray();
//        for (int i = 0; i < chars.length -1; i++) {
//            for (int j = i + 1; j < chars.length; j++) {
//                if (chars[i] == chars[j]){
//                    set.add(chars[i]);
//                    break;
//                }
//            }
//        }
//        return set.size();

//    }
    //    public static int duplicateCount(String text) {
//        Map<Character, Integer> map = new HashMap<>();
//        Set<Character> set = new HashSet<>();
//        char[] chars = text.toLowerCase().toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            int count = 0;
//            if (map.containsKey(chars[i])){
//                set.add(chars[i]);
//            }else {
//                map.put(chars[i], map.getOrDefault(chars[i],0) + 1);
//            }
//        }
//        return set.size();
//    }
//    public static int duplicateCount(String text) {
//        Set<Character> result = text.toLowerCase().chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().filter(e -> e.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toSet());
//        return result.size();
//    }


}