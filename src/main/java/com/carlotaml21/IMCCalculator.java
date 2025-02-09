package com.carlotaml21;

public class IMCCalculator {

    public double calculateIMC(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

}
