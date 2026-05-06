package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    ReverseString str = new ReverseString();
    @Test
    public void test() {
        assertEquals("avaJ" , str.reverseString("Java"));
    }
}
