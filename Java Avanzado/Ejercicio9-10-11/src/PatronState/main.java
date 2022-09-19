package PatronState;

public class main {
    public static void main (String []args){

        Laptop lap1= new Laptop();

        System.out.println(lap1.estado.apagar());

        System.out.println(lap1.estado.reiniciar());

        System.out.println(lap1.estado.suspender());

        System.out.println(lap1.estado.prender());

        System.out.println(lap1.estado.reiniciar());

        System.out.println(lap1.estado.apagar());

    }
}
