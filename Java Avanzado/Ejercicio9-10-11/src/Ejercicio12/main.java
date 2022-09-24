package Ejercicio12;

import java.util.HashMap;


public class main {
    public static void main (String []args){
        //** Llamada a las dos funciones de las diferentes clases.
        //A la clase DiaSemana se le pasa un String con el nombre del dia de la semana
        //mientras que a la clase Fruta se le pasa el valor que retorna la clase Diasemana
        //que es un integer, lo cual permite buscar en el map el valor de dicha key.

        System.out.println(Fruta.getFruta(DiaSemana.getDiaSemana("Viernes")));

    }




}
