package com.company;

public class Coche {
     public int puertas;

    public void incrementoPuerta(int a){
        puertas+=a;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "puertas=" + puertas +
                '}';
    }
}
