package Decorator;

public class main {
    public static void main(String []args){
//        TelefonoBasico tb= new TelefonoBasico();
//
//        tb.crear();

        TelefonoInteligente ti= new TelefonoInteligente(new TelefonoBasico());
        ti.crear();

        TelefonoNextGen tng= new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
        tng.crear();

    }
}
