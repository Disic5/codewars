package org.example.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Учитывая строку цифр, вы должны заменить любую цифру ниже 5 на «0», а любую цифру от 5 и выше на «1».
 * Верните полученную строку.
 * Примечание: ввод никогда не будет пустой строкой.
 */
public class FakeBinary {

    public static String fakeBin(String numberString) {
       return numberString.replaceAll("[0-4]","0").replaceAll("[5-9]","1");

    }

    //    public static String fakeBin(String numberString) {
//        char[] charArray = numberString.toCharArray();
//        StringBuilder sB = new StringBuilder(numberString.length());
//        for (int i = 0; i < charArray.length; i++) {
//            char ch = charArray[i];
//            if (ch < '5') {
//                ch = '0';
//                sB.append(ch);
//            } else {
//                ch = '1';
//                sB.append(ch);
//            }
//        }
//        return sB.toString();
//    }
//    public static String fakeBin(String numberString) {
//       return numberString.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(Collectors.joining());
//    }

//    public static String fakeBin(String numberString) {
//        char[] charArray = numberString.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            charArray[i] = charArray[i] < '5' ? '0' : '1';
//        }
//        return new String(charArray);
//    }
}
