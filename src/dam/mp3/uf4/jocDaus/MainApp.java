package dam.mp3.uf4.jocDaus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int option;

        while (!salir) {
            System.out.println("MENU");
            System.out.println("1. Juego dado");
            System.out.println("2. Salir");

            try {
                System.out.println("Escribe un numero: ");
                option = scanner.nextInt();
                switch (option) {

                    case 1:
                        System.out.println("El juego 1 ha sido seleccionado.");
                        JocDaus jocDaus = new JocDaus();
                        jocDaus.jocDaus();
                        break;

                    case 2:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo la opcion 1 o 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzaca un numero por favor");
                scanner.nextInt();
            }
        }
    }
}
