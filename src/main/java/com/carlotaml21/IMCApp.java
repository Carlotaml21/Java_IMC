package com.carlotaml21;

import java.util.Locale;
import java.util.Scanner;

public class IMCApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Ingresa tu peso (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Ingresa tu altura (m): ");
        double height = scanner.nextDouble();

        IMCCalculator calculator = new IMCCalculator();
        double imc = calculator.calculateIMC(weight, height);
        String classification = calculator.clasificateIMC(imc);

        System.out.println("Su IMC es: " + imc);
        System.out.println("Clasificacion: " + classification);

        scanner.close();
    }
}


