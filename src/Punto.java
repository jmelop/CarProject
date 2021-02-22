public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void desplaza(int x, int y) {
        this.x += x;
        this.y += y;

    }

    public String toString() {
        return "La posicion X es " + x + " y la posicion Y es " + y + "";
    }

}
