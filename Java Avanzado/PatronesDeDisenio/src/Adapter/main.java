package Adapter;

public class main {

    public static void main(String []args){
        //adaptamos un codigo viejo, al nuevo codigo.
        //creas un metodo envoltorio, para que cumpla con la interfaz
        Horno horno= new Horno();
        Lampara lampara= new Lampara();
        PowerAdapter bombillaInglesa= new PowerAdapter();

        enciende(horno);
        enciende(lampara);
        enciende(bombillaInglesa);


    }

    public static void enciende(Enchufable enchufable){
        enchufable.enciende();
    }
    public static void apaga(Enchufable enchufable){
        enchufable.apaga();
    }
    public static boolean estaEncendido(Enchufable enchufable){
        return enchufable.estaEncendido();
    }
}
