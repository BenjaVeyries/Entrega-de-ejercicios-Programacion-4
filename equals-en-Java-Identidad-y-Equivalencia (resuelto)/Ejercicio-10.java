public class Usuario {

    private static int contador = 0;

    private int id;
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = ++contador;
    }

    public static int getTotalUsuarios() {
        return contador;
    }
}