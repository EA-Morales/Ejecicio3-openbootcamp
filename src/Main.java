public class Main {
    public static void main(String[] args) {
        System.out.println(Suma(1,2,3));

        Coche myCar = new Coche();
        myCar.sumarPuertas(4);


        System.out.println(myCar.puertas);
    }

    public static int Suma (int a, int b, int c) {
        return a + b + c;
    }
}
class Coche{
    public int puertas = 1;

    public void sumarPuertas(int numeroPuertas){
        puertas = numeroPuertas;
    }
}