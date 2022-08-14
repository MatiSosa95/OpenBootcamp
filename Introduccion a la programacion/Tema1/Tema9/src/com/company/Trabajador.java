package com.company;

public class Trabajador extends  Persona{

    protected double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", salario=" + salario +
                '}';
    }
}
