import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Coche> coches = new ArrayList<>();
    private String nombre;

    public Concesionario(String nombre) {
        this.nombre = nombre;
    }

    public void añadirCoche(Coche coche) {
        if (!coches.contains(coche)) {
            coches.add(coche);
        }
    }

    public void borrarDeConductor(String quien) {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getConductor().equals(quien)) {
                coches.remove(i);
            }
        }
    }

    public void borrarTaxis() {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i) instanceof Taxi) {
                coches.remove(i);
            }
        }
    }

    public void avanzarTodos() {
        for (Coche coche : coches) {
            coche.avanza();
        }
    }

    public void listarCoches() {
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }
}
