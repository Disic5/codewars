package org.example.regExp;

import java.util.HashMap;
import java.util.Map;

/**
 * Банкоматы допускают использование 4- или 6-значных PIN-кодов, а PIN-коды не могут содержать ничего, кроме ровно 4 или ровно 6 цифр.
 * "1234"   -->  true
 * "12345"  -->  false
 * "a234"   -->  false
 */
public class ValidatePIN {

    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}") || pin.matches("\\d{6}");
    }

    /**
     вот еще решение
     return pin.matches("\\d{4}|\\d{6}");


     через символы
     public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6){
        return pin.chars().allMatch(Character::isDigit);
     }
        return false;
     }
     */


}