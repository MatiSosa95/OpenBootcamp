

public class Main {
    public static void main(String[] args) {
        Vehiculo auto= new Coche(120, "Falcon","Verde", "Combustion");
         auto.acelerar();
        System.out.println(auto);

        Vehiculo hibrido= new Hibrido(180,"Astra", "Rojo", "Electrico/Combustion");
        hibrido.acelerar();
        hibrido.acelerar();
        System.out.println(hibrido.toString());

        Vehiculo Tesla= new cocheElectrico(110,"Tesla", "Blanco", "Electrico");
        Tesla.frenar();
        Tesla.frenar();
        System.out.println(Tesla);


        Vehiculo Kawasaki= new Combustible(150, "Kawasaki","Negra", "Combustion");
        Kawasaki.frenar();
        System.out.println(Kawasaki);

    }
}