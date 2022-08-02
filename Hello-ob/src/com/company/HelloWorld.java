package com.company;

import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args){

    int x= 5;
    int y= 2;

    double resultado= (double) x/y;

    String nombre;

    Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nombre= sc.nextLine();

        System.out.println("Hola mi nombre es "+ nombre);
    }



}
