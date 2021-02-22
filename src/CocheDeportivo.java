public class CocheDeportivo extends Coche {

    public CocheDeportivo(String conductor, String tipo, String color) {
        super(conductor, tipo, color, Coche.posicionInicial);
    }

    @Override
    public void avanza() {
        double random = 0 + (Math.random() * (1));
        if (random >= 0.7) {
            super.getPosicion().desplaza(50, 0);
        } else {
            super.getPosicion().desplaza(30, 0);

        }
    }

}
