package Ejercicio12;

import java.util.HashMap;
import java.util.Map;

public class Fruta {
    /**
     * Se crea un map para  guardar los valores y las key.
     */
    private static Map<Integer,String> frutas= new HashMap<>();

    /**
     * Se le ingresan los valores al map. Uno por cada dia de la semana
     */
    static {
        frutas.put(1, "Anana");
        frutas.put(2,"Manzana");
        frutas.put(3,"Banana");
        frutas.put(4,"Naranja");
        frutas.put(5,"Mandarina");
        frutas.put(6,"Durazno");
        frutas.put(7,"Sandia");
    }

    /**
     *  @param dia integer que se usara como Key para encontrar el valor almacenado
     * @return retorna el nombre de la fruta con la key igual al parametro
     * @since 24/09/22
     */
    public static String getFruta(Integer dia){
        return frutas.get(dia);

    }
}
