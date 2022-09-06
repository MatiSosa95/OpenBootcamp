package Decorator;

public class TelefonoDecorator implements Telefono{

    private Telefono telefono;

    //Aqui se produce el decorador,con el constructor.

    public TelefonoDecorator(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public void crear() {
        this.telefono.crear();
    }
}
