package com.company;

public class Coche {

    String marca;
    String tipo;
    String color;
    boolean naftero;
    boolean gasolero;

    public Coche() {
    }

    public Coche(String marca, String tipo, String color, boolean naftero, boolean gasolero) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.naftero = naftero;
        this.gasolero = gasolero;
    }
}
