package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero entero. ");
        int numero= sc.nextInt();

        if(numero>0){
            System.out.println("Numero Positivo");
        } else if(numero<0){
            System.out.println("Numero Negativo");
        }else{
            System.out.println("El numero es 0");
        }
        System.out.println("--------------------------------------------");
        int numerowl= 1;
        while(numerowl<3){
            numerowl++;
            System.out.println(numerowl);
        }
        System.out.println("--------------------------------------------");
        int numeroDo= 2;
        do{
            numeroDo++;
            System.out.println(numeroDo);
        }while(numeroDo<3);
        System.out.println("--------------------------------------------");
        int numeroFor=0;
        for(int i=0;i<=3; i++){
            numeroFor++;
            System.out.println(numeroFor);
        }
        System.out.println("--------------------------------------------");

            System.out.println("Ingrese un numero del 1 al 4");
            int estacion=sc.nextInt();

            switch (estacion){
                case 1:
                    System.out.println("Estamos en Invierno");
                    break;
                case 2:
                    System.out.println("Estamos en Otoño");
                    break;
                case 3:
                    System.out.println("Estamos en Primavera");
                    break;
                case 4:
                    System.out.println("Estamos en Verano");
                    break;
                default:
                    System.out.println("No existe estacion");
                    break;
            }
        }
    }

