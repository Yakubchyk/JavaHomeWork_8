package com.yk2;

public class Kreis extends Figura {

    private double r;

    public Kreis(double r) {
        this.r = r;
    }

    @Override
    public double calcArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * r;
    }
}
