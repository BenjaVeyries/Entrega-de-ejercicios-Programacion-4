import java.util.*;

public class SistemaEmpleados {

    private Set<Empleado> empleados = new HashSet<>();

    public void agregar(Empleado e) {
        empleados.add(e);
    }

    public boolean existe(Empleado e) {
        return empleados.contains(e);
    }

    public void mostrar() {
        empleados.forEach(emp -> System.out.println(emp));
    }
}