package Factory;

public class main {


    public static void main(String [] args){

        //Facory te permite coaccionar una gerarquia de clases en una sola.
        PrecioFactory precio= new PrecioFactory("Argentina");

        System.out.println(precio.getPrecio());

        PrecioFactory precio2= new PrecioFactory("España");
        System.out.println(precio2.getPrecio());
    }
}
