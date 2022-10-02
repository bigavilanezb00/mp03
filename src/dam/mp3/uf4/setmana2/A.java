package dam.mp3.uf4.setmana2;

public class A {
    private int num;

    public A(){
        System.out.println("Sóc A");
    }

    public int getNum() {
        return num;
    }
}

class A2 extends A {

    public A2() {
        System.out.println("Sóc A2");
    }
}
