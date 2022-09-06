package Prototype;

public class Auto implements Cloneable {

    public String marca;
    public String modelo;
    public int puertas;

    public Auto() {}

    public Auto(String marca, String modelo, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
    }

    public Auto clonar() throws CloneNotSupportedException{
    return (Auto) this.clone();
    }
}
