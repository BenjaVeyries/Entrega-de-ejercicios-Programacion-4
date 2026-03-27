import java.util.*;

public class Estudiante {

    private int id;
    private String nombre;
    private String email;
    private List<Integer> calificaciones;

    public Estudiante(int id, String nombre, String email, List<Integer> calificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.calificaciones = calificaciones;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Estudiante otro = (Estudiante) obj;
        return id == otro.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}