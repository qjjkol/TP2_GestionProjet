package com.safae.numerals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.Test;

public class ArabicRomanNumeralsTest {

    @Test
    public void testConvert() {
        // Test des cas simples
        assertEquals("I", ArabicRomanNumerals.convert(1));
        assertEquals("IV", ArabicRomanNumerals.convert(4));
        assertEquals("V", ArabicRomanNumerals.convert(5));
        assertEquals("IX", ArabicRomanNumerals.convert(9));
        assertEquals("X", ArabicRomanNumerals.convert(10));
        assertEquals("L", ArabicRomanNumerals.convert(50));
        assertEquals("C", ArabicRomanNumerals.convert(100));
        assertEquals("D", ArabicRomanNumerals.convert(500));
        assertEquals("M", ArabicRomanNumerals.convert(1000));

        // Tests de nombres complexes
        assertEquals("XXVII", ArabicRomanNumerals.convert(27));   // 27 -> XXVII
        assertEquals("XLIV", ArabicRomanNumerals.convert(44));    // 44 -> XLIV
        assertEquals("XCIX", ArabicRomanNumerals.convert(99));    // 99 -> XCIX
        assertEquals("CDXLIV", ArabicRomanNumerals.convert(444));  // 444 -> CDXLIV
        assertEquals("CMXCIX", ArabicRomanNumerals.convert(999));  // 999 -> CMXCIX
        assertEquals("MMMCMXCIX", ArabicRomanNumerals.convert(3999)); // 3999 -> MMMCMXCIX
    }
}
