package dam.mp3.uf4;


import java.util.Random;
import java.util.Scanner;

public class Dau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas veces desea lanzar el dado? ");
        int tiradas = 0;
        try{
            tiradas = sc.nextInt();
        }catch (Exception e){
            System.out.println("Introduzca un numero por favor.");
        }

        int resultado = 0;
        int dado = 0;
        int dado2 = 0;
        int[] contador = new int[11];

        for (int i = 0; i < tiradas; i++) {
            dado = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
            resultado = dado + dado2;


            for (int j = 0; j < contador.length; j++) {
                if (resultado == j + 2) {
                    contador[j] = contador[j] + 1;
                }
            }
        }

        for (int i = 0; i < contador.length; i++) {
            System.out.println( i+2  + " ---> " + contador[i] + " veces");
        }


    }
}
