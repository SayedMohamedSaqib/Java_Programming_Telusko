package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcTest {

    @Test
    void test() {
        Calc c = new Calc();
        int result = c.divide(10, 5);
        int expected = 2;
        assertEquals(result, expected);
    }
}
