 class Coche extends Vehiculo {
    String marca;



     public Coche(int velocidad, String nombre, String color, String tipo){
         super(velocidad, nombre, color, tipo);
            this.marca="Ford";
    }
     @Override
     public void acelerar() {
         velocidad++;
     }

     @Override
     public void frenar() {
         velocidad--;
     }

     @Override
     public String toString() {
         return "Coche{" +
                 "marca='" + marca + '\'' +
                 ", velocidad=" + velocidad +
                 ", nombre='" + nombre + '\'' +
                 ", color='" + color + '\'' +
                 ", tipo='" + tipo + '\'' +
                 '}';
     }


 }

class cocheElectrico extends Vehiculo{
    Double watts;


    public cocheElectrico(int velocidad, String nombre, String color, String tipo){
       super(velocidad, nombre, color, tipo);
       this.watts= 3550d;

    }
    @Override
    public void acelerar() {
        velocidad++;
    }

    @Override
    public void frenar() {
        velocidad--;
    }

    @Override
    public String toString() {
        return "cocheElectrico{" +
                "watts=" + watts +
                ", velocidad=" + velocidad +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

}

class Combustible extends Vehiculo{

    int litrosDeNafta;

    public Combustible(int velocidad, String nombre, String color, String tipo){
        super(velocidad, nombre, color, tipo);
        this.litrosDeNafta=25;

    }
    @Override
    public void acelerar() {
        velocidad++;
    }

    @Override
    public void frenar() {
        velocidad--;
    }

    @Override
    public String toString() {
        return "Combustible{" +
                "litrosDeNafta=" + litrosDeNafta +
                ", velocidad=" + velocidad +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }


}

 class Hibrido extends Vehiculo{
     int HP;

     public Hibrido(int velocidad, String nombre, String color, String tipo) {
         super(velocidad, nombre, color, tipo);
         this.HP= 150;
     }
     @Override
     public void acelerar() {
         velocidad++;
     }

     @Override
     public void frenar() {
         velocidad--;
     }

     @Override
     public String toString() {
         return "Hibrido{" +
                 "HP=" + HP +
                 ", velocidad=" + velocidad +
                 ", nombre='" + nombre + '\'' +
                 ", color='" + color + '\'' +
                 ", tipo='" + tipo + '\'' +
                 '}';
     }
 }
