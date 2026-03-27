import java.util.*;

class Directorio {
    private Map<String, String> contactos = new HashMap<>();

    public void agregar(String nombre, String telefono) {
        contactos.put(nombre, telefono);
    }

    public String buscar(String nombre) {
        return contactos.get(nombre);
    }
}