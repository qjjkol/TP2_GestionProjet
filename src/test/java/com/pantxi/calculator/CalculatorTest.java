package com.pantxi.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test

    public void testAddition() {
        assertEquals(8, Calculator.addition(5, 3));
        assertEquals(0, Calculator.addition(-5, 5));
        assertEquals(-2, Calculator.addition(-1, -1));
    }
    @Test
    public void testDivision() {
        assertEquals(5.0, Calculator.division(10, 2));
        assertEquals(2.5, Calculator.division(5, 2));
        assertEquals(-5.0, Calculator.division(-10, 2));
    }



}
