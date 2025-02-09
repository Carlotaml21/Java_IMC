package com.carlotaml21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMCCalculatorTest {

    @Test
    public void testCalculateIMC() {
        IMCCalculator calculator = new IMCCalculator();
        double result = calculator.calculateIMC(70, 1.75);

        Assertions.assertEquals(22.85, result, 0.1);
    }
}

