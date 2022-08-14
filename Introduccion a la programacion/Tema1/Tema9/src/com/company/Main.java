package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente cliente= new Cliente();

        cliente.setNombre("Paul McCartney");
        cliente.setEdad(80);
        cliente.setTelefono(789456123);
        cliente.setCredito(850);

        System.out.println(cliente.toString());
    }
}
