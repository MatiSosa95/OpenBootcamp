package com.company;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static String reverse(String txt){
        String inverso="";
         for (int i = txt.length()-1; i>=0; i-- ){
             inverso+=txt.substring(i,i+1);
         }

        return inverso;
    }

    public static int DividePorCero( int a, int b) throws ArithmeticException, Exception{
        int resultado=0;
        try {
            resultado= a/b;
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }catch (Exception e){
            System.out.println("Demo de código");
        }
        return resultado;

    }
    public static void CopiaFichero (String FileIn, String FileOut){

        try{
            InputStream in= new FileInputStream(FileIn);
            byte[] dato= in.readAllBytes();
            in.close();

            PrintStream out= new PrintStream(FileOut);
            out.write(dato);
            out.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println(reverse("Hola Mundo"));
        System.out.println("=========================================");

        System.out.println("Parte 1");

        String[] arreglo= {"Ringo Starr", "John Lennon", "Paul McCartney", "George Harrinson"};

        for(String beatles: arreglo){
            System.out.println(beatles);
        }

        System.out.println("Parte 2");
        System.out.println("=========================================");
        int[][] enteros= new int[2][3];
        enteros[0][0]=1;
        enteros[0][1]=2;
        enteros[0][2]=3;
        enteros[1][0]=4;
        enteros[1][1]=5;
        enteros[1][2]=6;

        for (int i=0; i< enteros.length; i++){
            for(int j=0; j< enteros[i].length; j++){
                System.out.println("Posicion i: "+ i+ " Posicion j: "+ j );
            }
        }
        System.out.println("=========================================");
        System.out.println("Parte 3");
        Vector<Integer> vector= new Vector();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);

        System.out.println("Vector completo "+ vector);

        vector.remove(2);
        vector.remove(3);
        // se elimina el 5, porque al remover primero el index=2, el tamaño disminuye haciendo que el index= 3, sea el valor 5.
        System.out.println("Vector con items eliminados "+ vector);
        System.out.println("=========================================");
        System.out.println("Parte 4");

        System.out.println("Se desperdicia mucha memoria, ya que cada vez que se pasa el limite de la dimension del vector" +
                "el mismo se duplica");

        System.out.println("=========================================");
        System.out.println("Parte 5");

        ArrayList<String> ListaString= new ArrayList<>();

        ListaString.add("John Lennon");
        ListaString.add("Paul McCartney");
        ListaString.add("Yoko Ono");
        ListaString.add("Ringo Starr");

        for (String Beatles: ListaString){
            System.out.println(Beatles);
        }
        System.out.println("=========================================");
        LinkedList<String> CopiaListaString= new LinkedList<>(ListaString);

        for (String Beatles: CopiaListaString){
            System.out.println(Beatles);
        }
        System.out.println("=========================================");
        System.out.println("Parte 6");

        ArrayList<Integer> ListaInt= new ArrayList();

        for (int i=1; i<=10; i++){
            ListaInt.add(i);
        }
        for (int i=0; i<ListaInt.size(); i++) {
            if (ListaInt.get(i)%2==0){
                ListaInt.remove(i);
            }
        }

        for (int Lista: ListaInt
             ) {
            System.out.println(Lista);
        }

        System.out.println("=========================================");
        System.out.println("Parte 7");

        try{
            DividePorCero(4,0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("=========================================");
        System.out.println("Parte 8");

        Scanner sc= new Scanner(System.in);
        System.out.println("Agregue el fichero de entrada");
        String FileIn= sc.nextLine();
        System.out.println("Agregue fichero de salida");
        String FileOut= sc.nextLine();

        CopiaFichero(FileIn, FileOut);
    }
}
