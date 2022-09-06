package Factory;

public class PrecioFactory {

    Precio precio;
    private PrecioFactory() {}

    public PrecioFactory(String pais){
        if (pais.equalsIgnoreCase("Argentina")){
            System.out.println("Argentina, precio en pesos");
            precio= new PrecioPeso();
        }else{
            System.out.println("Otro Pais, precio en USD");
            precio= new PrecioUSD();
        }
    }

    public double getPrecio(){
        return precio.getPrecio();
    }
}
