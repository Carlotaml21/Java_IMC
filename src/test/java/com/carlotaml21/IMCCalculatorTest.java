package com.carlotaml21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IMCCalculatorTest {

    @Test
    public void testCalculateIMC() {
        IMCCalculator calculator = new IMCCalculator();
        double result = calculator.calculateIMC(70, 1.75);

        assertEquals(22.85, result, 0.1);
    }

    @Test
    public void testClasificateIMC(){
        IMCCalculator calculator = new IMCCalculator();
        assertEquals("Delgadez Severa", calculator.clasificateIMC(14));
        assertEquals("Delgadez moderada", calculator.clasificateIMC(16));
        assertEquals("Delgadez leve", calculator.clasificateIMC(18));
        assertEquals("Peso normal", calculator.clasificateIMC(22));
        assertEquals("Sobrepeso", calculator.clasificateIMC(26));
        assertEquals("Obesidad leve", calculator.clasificateIMC(32));
        assertEquals("Obesidad moderada", calculator.clasificateIMC(39));
        assertEquals("Obesidad morbida", calculator.clasificateIMC(43));


    }
}

