package dam.mp3.uf4;

import java.util.Date;

public class Castig {

    public static void main(String[] args) {
        final String MSG_A_COPIAR = "No tornaré a fer server mai m´s l'operador + per concatenar";
        final int LINIES_A_COPIAR = 5_000_000;
        String s = "";
        Date di = new Date();
        StringBuilder sb = new StringBuilder(MSG_A_COPIAR.length()*LINIES_A_COPIAR);
        for (int i = 0; i < LINIES_A_COPIAR; i++) {

            sb.append(MSG_A_COPIAR);
            //s.concat(MSG_A_COPIAR);
            //s += MSG_A_COPIAR;

            // s = s + MSG_A_COPIAR
        }

        sb.toString();
        Date df = new Date();

        //System.out.println("Ha acabat en %d ms", df.getTime()-di.getTime());
    }
}
