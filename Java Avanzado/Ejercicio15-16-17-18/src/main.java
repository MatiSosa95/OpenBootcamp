import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String []args){
        try{
            Dividir(5, 0);
        }catch (Exception e){
            System.out.println("El Error es:" +e.getMessage()+ " y es del tipo "+ e.getClass());
        }
        try{
            BuscarElemento(9);
        }catch (Exception e){
            System.out.println("El Error es:" +e.getMessage()+ " y es del tipo "+ e.getClass());
        }

        try{
            AbrirFichero("fichero.txt");
        }catch (Exception e){
            System.out.println("El Error es:" +e.getMessage()+ " y es del tipo "+ e.getClass());
        }

    }

    public static int Dividir(int NumA, int NumB){
        return NumA/NumB;
    }

    public static int BuscarElemento(int Elemento){
        int[] array= {1,2,3,4,5,6};

        return array[Elemento];
    }

    public static void AbrirFichero(String Fichero) throws IOException {
        String cadena;
        FileReader file= new FileReader(Fichero);
        BufferedReader BFile= new BufferedReader(file);
        while ((cadena=BFile.readLine())!=null){
            System.out.println(cadena);
        }
        BFile.close();
    }
}
