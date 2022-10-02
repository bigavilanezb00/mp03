package dam.mp3.uf4.jocDaus;

import java.util.Date;

public class Dau {
    private int numDau;

    public int getNumDau() {
        return numDau;
    }

    public void setNumDau(int numDau) {
        this.numDau = numDau;
    }

    public Dau( int numDau) {
        this.numDau = numDau;
    }

    @Override
    public String toString() {
        return "Numero dau: " + numDau + " ";
    }
}
