import java.util.*;

class Usuario {
    private String username;
    private Set<Usuario> amigos = new HashSet<>();

    public Usuario(String username) {
        this.username = username;
    }

    public void agregarAmigo(Usuario u) {
        amigos.add(u);
    }

    public boolean esAmigo(Usuario u) {
        return amigos.contains(u);
    }
}