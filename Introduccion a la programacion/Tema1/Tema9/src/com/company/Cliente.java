package com.company;

public class Cliente  extends Persona{
    protected double credito;


    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                '}';
    }
}
