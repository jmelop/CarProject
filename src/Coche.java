import java.util.Objects;

public abstract class Coche {
    private String conductor;
    private String tipo;
    private String color;
    private Punto posicion;
    public static final Punto posicionInicial = new Punto(0, 200);


    public Coche(String conductor, String tipo, String color, Punto posicion) {
        this.conductor = conductor;
        this.tipo = tipo;
        this.color = color;
        this.posicion = posicion;
    }

    public String getConductor() {
        return this.conductor;
    }

    public abstract void avanza();

    public String getTipo() {
        return this.tipo;
    }

    public String getColor() {
        return this.color;
    }

    public Punto getPosicion() {
        return this.posicion;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object o) {
        Coche coche = (Coche) o;

        if (coche.getColor().equals(this.getColor()) && coche.getTipo().equals(this.getTipo())
                && coche.getConductor().equals(this.getConductor())) {
            return true;
        }
        return false;
    }


    public String toString() {
        return "El conductor del coche es " + conductor + ", el tipo de coche es " + tipo + ", el colo es el " + color +
                " y la posicion del coche usando coordenadas es " + posicion + ".";
    }


}
