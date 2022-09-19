package Refactoring;

public class main {
    public static void main(String []args){

        int[] numeros= {12,45,78,-5,-45,100};

        imprimeMayorYMenor(numeros);
    }

    public static  void imprimeMayorYMenor(int []numeros){
        int mayor=0;
        int menor=numeros[0];

        for (int i: numeros) {
            mayor= mayor<i ? i:mayor;
            menor= menor>i ? i:menor;
        }
        System.out.println("El numero mayor es:" + mayor);
        System.out.println("El numero menor es:" + menor);
    }
}
