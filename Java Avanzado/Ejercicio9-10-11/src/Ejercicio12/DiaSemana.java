package Ejercicio12;

import java.util.HashMap;
import java.util.Map;

public class DiaSemana {
    /**
     * Se crea un map para  guardar los valores y las key.
     */
    private static Map<String,Integer> diaSemanas= new HashMap<>();
    /**
     * Se le ingresan los valores al map. Uno por cada dia de la semana
     */
    static {
        diaSemanas.put("Lunes",1);
        diaSemanas.put("Martes",2);
        diaSemanas.put("Miercoles",3);
        diaSemanas.put("Jueves",4);
        diaSemanas.put("Viernes",5);
        diaSemanas.put("Sabado",6);
        diaSemanas.put("Domingo",7);
    }
    /**
     *  @param dia String que se usara como Key para encontrar el valor almacenado
     * @return retorna el valor del dia de la semana con la key igual al parametro
     * @since 24/09/22
     */
    public static int getDiaSemana(String dia){
        return diaSemanas.get(dia);

    }
}
