package Decorator;

public class TelefonoBasico implements Telefono{
    @Override
    public void crear() {
        System.out.println("Soy un telefono Basico. Tengo estas caracteristicas");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){
        System.out.println("-> Telefono Basico: Tengo GSM");
    }

    private void tengoSMS(){
        System.out.println("-> Telefono Basico: Tengo SMS");
    }
}
