package Builder;

public class main {
    public static void main(String []args){
       // Vehiculo vehiculo= new Vehiculo();

        Vehiculo coche= new CocheBuilder("Ford")
                .setPuertas(5)
                .setMotor("Combustion")
                .build();

        System.out.println(coche.getMarca());
        System.out.println(coche.getMotor());
        System.out.println(coche.getPuertas());

        StringBuilder cadena= new StringBuilder("Hola Matias");
        cadena.append(" ¿Como").append(" estas").append("?");

        System.out.println(cadena);


    }
}
