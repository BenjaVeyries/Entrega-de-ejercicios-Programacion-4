import java.util.*;

class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " (" + categoria + ")";
    }
}

public class MainProductos {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Laptop", 700.000, "Electrónica"));
        productos.add(new Producto("Mouse", 40.000, "Accesorios"));
        productos.add(new Producto("Teclado", 50.000, "Accesorios"));
        productos.add(new Producto("Monitor", 300.000, "Electrónica"));

        // Ordenar por precio
        productos.sort(Comparator.comparing(Producto::getPrecio));
        System.out.println("Por precio: " + productos);

        // Ordenar por nombre descendente
        productos.sort(Comparator.comparing(Producto::getNombre).reversed());
        System.out.println("Por nombre desc: " + productos);

        // Ordenar por categoría y luego precio
        productos.sort(Comparator.comparing(Producto::getCategoria)
                .thenComparing(Producto::getPrecio));
        System.out.println("Por categoría y precio: " + productos);
    }
}