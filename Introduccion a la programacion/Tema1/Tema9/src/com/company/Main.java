package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente cliente= new Cliente();

        cliente.setNombre("Paul McCartney");
        cliente.setEdad(80);
        cliente.setTelefono(789456123);
        cliente.setCredito(850);

        System.out.println(cliente.toString());

        Trabajador trabajador= new Trabajador();

        trabajador.setNombre("Yoko Ono");
        trabajador.setEdad(80);
        trabajador.setTelefono(456789123);
        trabajador.setSalario(1568.85);

        System.out.println(trabajador.toString());
    }
}
