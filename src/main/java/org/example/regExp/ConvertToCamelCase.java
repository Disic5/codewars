package org.example.regExp;
/**
 Завершите метод/функцию, чтобы он преобразовывал слова, разделенные тире/подчеркиванием, в верблюжий регистр.
 Первое слово в выводе должно быть написано с заглавной буквы, только если исходное слово было написано с заглавной буквы
 (так называемый верхний регистр Camel, также часто называемый регистром Pascal). Следующие слова всегда должны быть с заглавной буквы.

 "the-stealth-warrior" gets converted to "theStealthWarrior"

 "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

 "The_Stealth-Warrior" gets converted to "TheStealthWarrior"

 */
public class ConvertToCamelCase {

    static String toCamelCase(String s){
      String[] words = s.split("[\\W_]+");
      StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0){
                word = word.isEmpty() || Character.isUpperCase(word.charAt(0))? word : word.toLowerCase();
            }else{
                word = word.isEmpty()? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        return builder.toString();
    }

}
