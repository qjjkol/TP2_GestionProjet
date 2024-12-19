package com.safae.numerals;

public class ArabicRomanNumerals {
    private static final int[] arabicValues = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 , 1212
    };

    private static final String[] romanSymbols = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public static String convert(int number) {
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < arabicValues.length; i++) {
            while (number >= arabicValues[i]) {
                roman.append(romanSymbols[i]);
                number -= arabicValues[i];
            }
        }

        return roman.toString();
    }
}
