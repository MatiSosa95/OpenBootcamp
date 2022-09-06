package Decorator;

public class TelefonoNextGen extends TelefonoDecorator{


    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("-> NextGen: Tengo tmb 5G");
        System.out.println("-> NextGen:  Tengo tmb Volte");
    }
}
