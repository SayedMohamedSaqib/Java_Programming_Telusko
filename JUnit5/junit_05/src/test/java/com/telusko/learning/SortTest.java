package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class SortTest {
    @Test
    void testingSortMethod() {
        BasicSort array = new BasicSort();
        int unsorted[] = {3,2,1};
        assertTimeout(Duration.ofMillis(1), () -> array.sort(unsorted));
    }
}
