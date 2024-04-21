package com.yk1;

public class Main {
    public static void main(String[] args) {
        Director d = new Director();
        d.printInfo();

        Buchhalter b = new Buchhalter();
        b.printInfo();

        Mitarbeiter m = new Mitarbeiter();
        m.printInfo();
    }
}
