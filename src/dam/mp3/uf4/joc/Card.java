package dam.mp3.uf4.joc;

import java.io.Serializable;
public class Card implements Serializable {
    public int num;
    private String pal;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPal() {
        return pal;
    }

    public void setPal(int pal) {
        //0 -> bastos, 1 -> espases, 2 ->or, 3-> copes
        switch (pal){
            case 0:
                this.pal = "bastos";
                break;
            case 1:
                this.pal = "espases";
                break;
            case 2:
                this.pal = "or";
                break;
            case 3:
                this.pal = "copes";
                break;
        }
    }

    public void setPal(String pal) {
        this.pal = pal;
    }

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", pal='" + pal + '\'' +
                '}';
    }
}
