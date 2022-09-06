package Adapter;

public class PowerAdapter implements Enchufable{

    public BombillaInglesa bombilla= new BombillaInglesa();
    @Override
    public void enciende() {
        bombilla.turnOn(110);
    }

    @Override
    public void apaga() {
    bombilla.turnOff();
    }

    @Override
    public boolean estaEncendido() {

        return bombilla.inPoweredOn();
    }
}
