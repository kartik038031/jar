package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumTest {
    @Test
    public void testAddition() {
        Sum sum = new Sum();
        assertEquals(12, sum.add(5, 7));
    }
}
