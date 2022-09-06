package Singleton;

public class Main {
    public static void main(String []args){
//        Singleton singleton= Singleton.getInstance();
//        //el patron singleton pretende evitar la creacion de nuevas instancias

        Aplicacion app= Aplicacion.getInstance();
        Aplicacion app2= Aplicacion.getInstance();

        app.run();
        app2.run();

        System.out.println(app + " " +app2);






    }
}
