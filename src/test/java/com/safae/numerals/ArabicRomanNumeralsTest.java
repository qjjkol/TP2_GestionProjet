package com.safae.numerals;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralsTest {

    @Test
    public void testConvert() {
        assertEquals("I", ArabicRomanNumerals.convert(1));
        assertEquals("III", ArabicRomanNumerals.convert(3));
        assertEquals("IV", ArabicRomanNumerals.convert(4));
        assertEquals("V", ArabicRomanNumerals.convert(5));
        assertEquals("X", ArabicRomanNumerals.convert(10));
        assertEquals("XXXIX", ArabicRomanNumerals.convert(39));
        assertEquals("L", ArabicRomanNumerals.convert(50));
    }

}