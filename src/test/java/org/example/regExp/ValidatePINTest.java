package org.example.regExp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatePINTest {

    @Test
    void validatePinTest() {
        assertEquals(true,ValidatePIN.validatePin("2896"));
        assertEquals(true,ValidatePIN.validatePin("0000"));
        assertEquals(true,ValidatePIN.validatePin("289612"));
        assertEquals(true,ValidatePIN.validatePin("289667"));
        assertEquals(true,ValidatePIN.validatePin("000000"));
        assertEquals(true,ValidatePIN.validatePin("999999"));
        assertEquals(true,ValidatePIN.validatePin("9090"));

    }
    @Test
    public void nonDigitCharacters() {
        assertEquals(false, ValidatePIN.validatePin("a234"));
        assertEquals(false, ValidatePIN.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, ValidatePIN.validatePin("1"));
        assertEquals(false, ValidatePIN.validatePin("12"));
        assertEquals(false, ValidatePIN.validatePin("123"));
        assertEquals(false, ValidatePIN.validatePin("12345"));
        assertEquals(false, ValidatePIN.validatePin("1234567"));
        assertEquals(false, ValidatePIN.validatePin("-1234"));
        assertEquals(false, ValidatePIN.validatePin("1.234"));
        assertEquals(false, ValidatePIN.validatePin("00000000"));
    }
}