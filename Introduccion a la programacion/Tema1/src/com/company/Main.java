package com.company;

public class Main {

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(suma(3,4,5));

        Coche micoche=new Coche();

        micoche.incrementoPuerta(1);

        System.out.println(micoche.toString());


    }
}
