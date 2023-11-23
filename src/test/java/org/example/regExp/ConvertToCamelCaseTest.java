package org.example.regExp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToCamelCaseTest {

    @Test
    void toCamelCaseTest() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", ConvertToCamelCase.toCamelCase(input));
    }
    @Test
    void toSomeDashLowerStartTest() {
        String input = "The-Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("TheStealthWarrior", ConvertToCamelCase.toCamelCase(input));
    }
    @Test
    void toCamelCaseLongTest() {
        String input = "You_have_chosen_to_translate_this_kata";
        System.out.println("input: " + input);
        assertEquals("YouHaveChosenToTranslateThisKata", ConvertToCamelCase.toCamelCase(input));
    }
    @Test
    void toSomeDashLowerStartLongTest() {
        String input = "You_have_chosen_to_translate_this_kata";
        System.out.println("input: " + input);
        assertEquals("YouHaveChosenToTranslateThisKata", ConvertToCamelCase.toCamelCase(input));
    }
}