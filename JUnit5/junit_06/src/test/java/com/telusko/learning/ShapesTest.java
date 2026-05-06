package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapesTest {

    Shapes shape;

    //Called Before each test case, here for 2 times
    @BeforeEach 
    void init() {
        System.out.println("Init started");
        shape = new Shapes();
        System.out.println("Before Test");
    }

    @Test
    void testComputeSquareArea() {
        assertEquals(25.0, shape.computeSquareArea(5), 0.1);
        System.out.println("Test 1");
    }


    @Test
    void testComputeCircleArea() {
        assertEquals(78.5, shape.computeCircleArea(5), 0.1);
        System.out.println("Test 2");
    }
    
    @AfterEach
    void destroy() {
        System.out.println("After Each Test");
    }
}
