package org.example.string;
/**
 https://www.codewars.com/kata/5596f6e9529e9ab6fb000014/train/java
 "coffee", "eecoff" => 2
 "eecoff", "coffee" => 4
 "moose", "Moose" => -1
 "isn't", "'tisn" => 2
 "Esham", "Esham" => 0
 "dog", "god" => -1
 */
public class CalculateString {

//    static int shiftedDiff(String first, String second) {
//        if (first.equals(second)) {
//            return 0;
//        }
//        char[] chars = first.toCharArray();
//        int count = 0;
//        char[] secondArray = second.toCharArray();
//        int length = secondArray.length - 1;
//        while ( length > 0) {
//            char lastIndex = chars[chars.length - 1];
//            for (int i = chars.length - 1; i > 0; i--) {
//                chars[i] = chars[i - 1];
//            }
//            chars[0] = lastIndex;
//            String result = new String(chars);
//            count++;
//            length --;
//
//            if (result.equals(second)){
//                return count;
//            }
//        }
//
//        return - 1;
//    }

static int shiftedDiff(String first, String second) {
    if (first.length() != second.length()){
        return -1;
    }
    /** конкатенируем две строки например abc и нам надо получить cab
     cab+cab = cabcab и indexOf выведит нам индекс первое вхождение abc
     */
    return (second + second).indexOf(first);
}

}
