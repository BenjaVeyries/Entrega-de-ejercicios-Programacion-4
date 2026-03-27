public class Producto {

    private static int contador = 0;

    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        contador++;
    }

    public static int getTotal() {
        return contador;
    }
}