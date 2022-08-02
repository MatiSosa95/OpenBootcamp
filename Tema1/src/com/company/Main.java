package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nombre;
        int edad;
        long telefono;
        boolean estudiante;

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.println( "Ingrese su edad");
        edad = sc.nextInt();

        System.out.println("Ingrese su numero de telefono");
        telefono = sc.nextLong();

        System.out.println("¿Es estudiante?(True/False)");
        estudiante = sc.nextBoolean();

        if (estudiante){
            System.out.println("Hola soy "+ nombre + " tengo "+ edad + "años. Soy estudiante de programacion y mi telefono es: "+ telefono);
        }else {
            System.out.println("Hola soy "+ nombre + " tengo "+ edad + "años. No soy estudiante de programacion y mi telefono es: "+ telefono);
        }



    }
}
