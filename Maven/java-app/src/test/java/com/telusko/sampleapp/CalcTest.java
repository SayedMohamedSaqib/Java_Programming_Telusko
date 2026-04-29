package com.telusko.sampleapp;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.telusko.Calc;
public class CalcTest {

    @Test
    void testCalc() {
        Calc calc = new Calc();

        int actualResult = calc.divide(10, 5);
        int expectedResult = 2;

        assertEquals(expectedResult, actualResult);
    }

}
