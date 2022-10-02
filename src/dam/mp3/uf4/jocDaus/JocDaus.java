package dam.mp3.uf4.jocDaus;

import java.util.Scanner;

public class JocDaus {
    Dau dau1,dau2,dau3;
    Scanner scanner = new Scanner(System.in);
    public void jocDaus() {
        int option = 0;
        int victoria = 0;
        int derrotas = 0;

        for (int i = 0; option!=2; i++) {
            System.out.println("Juego dados");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            option = scanner.nextInt();

            if (option == 1 || option == 2) {
                dau1 = new Dau((int) (Math.random()*6 + 1));
                dau2 = new Dau((int) (Math.random()*6 + 1));
                dau3 = new Dau((int) (Math.random()*6 + 1));

                System.out.println(dau1);
                System.out.println(dau2);
                System.out.println(dau3);

                if (dau1.getNumDau() == dau2.getNumDau() && dau2.getNumDau() == dau3.getNumDau()) {
                    System.out.println("Eres el ganador!");
                    victoria++;
                } else {
                    System.out.println("Eres un perdedor!");
                    derrotas++;
                }
            } else {
                System.out.println("Introduce un valor valido.");
            }

            System.out.printf("Has Ganado: %d veces \n",victoria);
            System.out.printf("Has perdido: %d veces \n",derrotas);
            System.out.println("");
            System.out.println("");
        }

    }
}
