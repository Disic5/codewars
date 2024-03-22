package org.example.string;

import java.util.Arrays;

public class UniqString {

//    public static String findUniqString(String str){
//        for (Character ch : str.toCharArray()){
//            if (str.indexOf(ch) == str.lastIndexOf(ch)){
//                return ch.toString();
//            }
//        }
//        return "not found uniq string";
//    }
    public static String findUniqString(String str){
        return String.valueOf((char) str.chars().filter(s -> str.indexOf(s) == str.lastIndexOf(s)).findFirst().orElse(0));
    }
}
