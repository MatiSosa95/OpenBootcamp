package Prototype;

public class main {
    public static void main(String []args){
        Auto auto= new Auto();

        auto.marca= "Ford";
        auto.modelo= "Mustang";
        auto.puertas= 3;

        System.out.println("Marca "+ auto.marca +" Modelo "+ auto.modelo+ " Cantidad de puertas "+ auto.puertas);
        try{
            Auto clon= auto.clonar();
            clon.marca= "chevrolet";
            clon.modelo= "Astra";
            System.out.println("Marca "+ clon.marca +" Modelo "+ clon.modelo+ " Cantidad de puertas "+ clon.puertas);
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
            Auto auto2 = new Auto("Ford", "Falcon", 5);
        }




    }
}
