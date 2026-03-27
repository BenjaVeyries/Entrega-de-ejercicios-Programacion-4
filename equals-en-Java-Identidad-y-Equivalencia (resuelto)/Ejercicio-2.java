import java.util.*;
import java.util.stream.*;

public class Empleado {

    private String nombre;
    private String departamento;
    private double salario;
    private int añosExperiencia;

    public Empleado(String nombre, String departamento, double salario, int añosExperiencia) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.añosExperiencia = añosExperiencia;
    }

    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }
    public int getAñosExperiencia() { return añosExperiencia; }

    // 1
    public static List<Empleado> filtrarPorDepto(List<Empleado> lista, String depto) {
        return lista.stream()
                .filter(e -> e.getDepartamento().equals(depto))
                .toList();
    }

    // 2
    public static double salarioPromedio(List<Empleado> lista) {
        return lista.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0);
    }

    // 3
    public static Optional<Empleado> maxSalario(List<Empleado> lista) {
        return lista.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));
    }

    // 4
    public static Map<String, List<Empleado>> agrupar(List<Empleado> lista) {
        return lista.stream()
                .collect(Collectors.groupingBy(Empleado::getDepartamento));
    }

    // 5
    public static List<Empleado> seniors(List<Empleado> lista) {
        return lista.stream()
                .filter(e -> e.getAñosExperiencia() > 3 && e.getSalario() > 3000)
                .toList();
    }
}