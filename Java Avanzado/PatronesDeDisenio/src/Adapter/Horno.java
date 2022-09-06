package Adapter;

public class Horno implements Enchufable{

    boolean encendido= false;

    @Override
    public void enciende() {
    encendido= true;
        System.out.println("horno encendido");
    }

    @Override
    public void apaga() {
    encendido= false;
        System.out.println("horno apagado");
    }

    @Override
    public boolean estaEncendido() {
    return encendido;
    }
}
