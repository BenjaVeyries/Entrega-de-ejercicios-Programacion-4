import java.util.*;
import java.util.stream.*;

class Tarea {
    String nombre;
    String estado;
    int prioridad;

    public Tarea(String nombre, String estado, int prioridad) {
        this.nombre = nombre;
        this.estado = estado;
        this.prioridad = prioridad;
    }
}

class SistemaTareas {
    private List<Tarea> tareas = new ArrayList<>();

    public void agregar(Tarea t) {
        tareas.add(t);
    }

    public List<Tarea> filtrarPorEstado(String estado) {
        return tareas.stream()
                .filter(t -> t.estado.equals(estado))
                .toList();
    }
}