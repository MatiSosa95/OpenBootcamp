package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona1= new Persona();

        persona1.setNombre("John Lennon");
        persona1.setEdad(82);
        persona1.setTelefono(123456789);
        
        System.out.println(persona1.toString());
    }
}
