package org.example.arrays;

import java.util.Arrays;
/**
 Рассмотрим массив/список овец, в котором некоторые овцы могут отсутствовать на своем месте.
 Нам нужна функция, которая подсчитывает количество овец, присутствующих в массиве (истина означает наличие).
 For example,
 [true,  true,  true,  false,
 true,  true,  true,  true ,
 true,  false, true,  false,
 true,  false, false, true ,
 true,  true,  true,  true ,
 false, false, true,  true]
 Правильный ответ будет 17. Подсказка: не забудьте проверить наличие неверных значений, таких как null/undefined.
*/

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean bool : arrayOfSheeps) {
           if (bool != null && bool){
               count++;
           }
        }
        return count;
    }
//    public int countSheeps(Boolean[] arrayOfSheeps) {
//       return (int) Arrays.stream(arrayOfSheeps).filter(bool -> bool!= null && bool.equals(true)).count();
//    }

}
