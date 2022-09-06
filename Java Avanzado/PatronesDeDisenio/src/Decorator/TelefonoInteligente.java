package Decorator;

public class TelefonoInteligente extends TelefonoDecorator{

    public TelefonoInteligente(Telefono telefono) {
        super(telefono);
    }
    @Override
    public void crear(){
        super.crear();
        System.out.println("-> Telefono Inteligente Tengo tmb 4G");
    }
}
