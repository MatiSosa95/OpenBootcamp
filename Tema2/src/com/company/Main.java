package com.company;

import java.util.Scanner;

public class Main {

    public static double IVA( double a){
        //IVA en Argentina es de 21%
        return a+a*0.21;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double precio;

        System.out.println("Ingrese el precio sin iva");
        precio= sc.nextDouble();

        System.out.println("El precio final, con IVA es de : "+ IVA(precio));

    }
}
