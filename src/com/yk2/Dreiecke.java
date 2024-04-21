package com.yk2;

public class Dreiecke extends Figura {
    private double sideA;
    private double sideB;
    private double sideC;

    public Dreiecke(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public double calcArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB + sideC;
    }

}

