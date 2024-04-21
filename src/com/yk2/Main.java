package com.yk2;

public class Main {
    public static void main(String[] args) {

        Figura[] figura = new Figura[5];
        figura[0] = new Dreiecke(3, 6, 8);
        figura[1] = new Quadrat(6, 8);
        figura[2] = new Kreis(8);
        figura[3] = new Dreiecke(10, 8, 10);
        figura[4] = new Quadrat(10, 10);
        System.out.println("Общий периметр: ");
        double totalPerimetr = 0;
        for (Figura f : figura) {
            System.out.print(f.calcPerimeter());
            totalPerimetr += f.calcPerimeter();
            if (f != figura[4]) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + totalPerimetr);
    }
}
