package com.trov.spekexperiments;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testSum() throws Exception {
        Calculator sut = new Calculator();
        int result = sut.sum(1, 2);
        assertEquals(3, result);
    }
}
