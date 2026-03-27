import java.util.*;
import java.util.stream.Collectors;

class Evento {
    private String nombre;
    private String fecha;
    private String categoria;
    private Set<String> participantes;

    public Evento(String nombre, String fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
        this.participantes = new HashSet<>();
    }

    public void agregarParticipante(String dni) {
        participantes.add(dni); // evita duplicados automáticamente
    }

    public int getCantidadParticipantes() {
        return participantes.size();
    }

    public String getCategoria() {
        return categoria;
    }

    public Set<String> getParticipantes() {
        return participantes;
    }

    @Override
    public String toString() {
        return nombre + " (" + categoria + ") -> " + participantes.size() + " participantes";
    }
}

public class SistemaEventos {
    public static void main(String[] args) {

        List<Evento> eventos = new ArrayList<>();

        Evento e1 = new Evento("Tech", "2026-01-10", "Tecnología");
        Evento e2 = new Evento("Musica", "2026-02-10", "Entretenimiento");
        Evento e3 = new Evento("Code", "2026-03-10", "Tecnología");

        e1.agregarParticipante("1");
        e1.agregarParticipante("2");

        e2.agregarParticipante("2");
        e2.agregarParticipante("3");

        e3.agregarParticipante("1");
        e3.agregarParticipante("4");

        eventos.add(e1);
        eventos.add(e2);
        eventos.add(e3);

        // 1. Total participantes únicos
        long totalUnicos = eventos.stream()
                .flatMap(e -> e.getParticipantes().stream())
                .distinct()
                .count();

        System.out.println("Participantes únicos: " + totalUnicos);

        // 2. Agrupar por categoría
        Map<String, Long> porCategoria = eventos.stream()
                .collect(Collectors.groupingBy(
                        Evento::getCategoria,
                        Collectors.counting()
                ));

        System.out.println("Eventos por categoría: " + porCategoria);

        // 3. Evento con más participantes
        Evento max = eventos.stream()
                .max(Comparator.comparing(Evento::getCantidadParticipantes))
                .orElse(null);

        System.out.println("Evento con más participantes: " + max);
    }
}