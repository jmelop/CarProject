public class CocheEconomico extends Coche {

    public CocheEconomico(String conductor, String tipo, String color) {
        super(conductor, tipo, color, Coche.posicionInicial);
    }

    @Override
    public void avanza() {
        double random = 0 + (Math.random() * (1));
        if (random >= 0.5) {
            super.getPosicion().desplaza(20, 0);
        } else {
            super.getPosicion().desplaza(25, 0);
        }
    }
}
