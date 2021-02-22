public class Taxi extends Coche {
    public int numPlazas;

    public Taxi(String conductor, String tipo, String color, int numPlazas) {
        super(conductor, tipo, color, Coche.posicionInicial);
        this.numPlazas = numPlazas;
    }

    @Override
    public void avanza() {
        double random = 0 + (Math.random() * (1));
        if (random >= 0.33) {
            super.getPosicion().desplaza(35, 0);
        } else {
            super.getPosicion().desplaza(15, 0);

        }
    }

    public int getNumPlazas() {
        return this.numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
}
