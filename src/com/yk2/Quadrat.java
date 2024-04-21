package com.yk2;

public class Quadrat extends Figura {
    private double sideA;
    private double sideB;

    public Quadrat(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public double calcPerimeter() {
        return (sideA * 2) + (sideB * 2);
    }
}
