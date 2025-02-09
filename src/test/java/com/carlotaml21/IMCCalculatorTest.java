package com.carlotaml21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IMCCalculatorTest {
    @Test
    public void testCalculateIMC() {
        assertEquals(22.86, IMCCalculator.calculateIMC(70, 1.75), 0.01);
    }