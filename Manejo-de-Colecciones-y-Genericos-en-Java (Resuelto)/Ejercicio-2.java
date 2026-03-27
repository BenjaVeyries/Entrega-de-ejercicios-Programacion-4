import java.util.HashMap;

class Usuario {
    private String dni;
    private String nombre;
    private String email;
    private String telefono;

    public Usuario(String dni, String nombre, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getDni() { return dni; }

    @Override
    public String toString() {
        return "DNI: " + dni + " | Nombre: " + nombre +
               " | Email: " + email + " | Tel: " + telefono;
    }
}

class SistemaUsuarios {
    private HashMap<String, Usuario> usuarios = new HashMap<>();

    public void agregarUsuario(Usuario u) {
        usuarios.put(u.getDni(), u);
    }

    public Usuario buscar(String dni) {
        return usuarios.get(dni);
    }

    public boolean actualizar(String dni, Usuario nuevo) {
        if (usuarios.containsKey(dni)) {
            usuarios.put(dni, nuevo);
            return true;
        }
        return false;
    }

    public boolean eliminar(String dni) {
        return usuarios.remove(dni) != null;
    }

    public void listar() {
        usuarios.values().forEach(System.out::println);
    }
}

public class MainUsuarios {
    public static void main(String[] args) {
        SistemaUsuarios sistema = new SistemaUsuarios();

        sistema.agregarUsuario(new Usuario("1", "Benjamin", "benjamin@gmail.com", "123"));
        sistema.agregarUsuario(new Usuario("2", "Tomas", "tomas@gmail.com", "456"));

        System.out.println("Buscar: " + sistema.buscar("1"));

        sistema.listar();
    }
}