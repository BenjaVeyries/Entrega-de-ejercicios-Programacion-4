
import java.util.*;


interface EmpleadoBase {
    String getNombre();
    double calcularSalario();
}

interface Bonificable {
    double calcularBonificacion();
}

interface Imponible {
    double calcularImpuesto();
}


class EmpleadoFull implements EmpleadoBase, Bonificable, Imponible {

    private String nombre;
    private double salario;

    public EmpleadoFull(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalario() {
        return salario;
    }

    public double calcularBonificacion() {
        return salario * 0.1;
    }

    public double calcularImpuesto() {
        return salario * 0.2;
    }
}


public class Ejercicio4 {

    public static void main(String[] args) {

        List<EmpleadoBase> lista = new ArrayList<>();
        lista.add(new EmpleadoFull("Ana", 3000));
        lista.add(new EmpleadoFull("Juan", 4000));

        for (EmpleadoBase e : lista) {

            double total = e.calcularSalario();

            if (e instanceof Bonificable) {
                total += ((Bonificable) e).calcularBonificacion();
            }

            if (e instanceof Imponible) {
                total -= ((Imponible) e).calcularImpuesto();
            }

            System.out.println(e.getNombre() + " sueldo final: " + total);
        }
    }
}