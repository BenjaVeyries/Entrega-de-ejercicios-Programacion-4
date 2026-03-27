import java.util.*;


interface Autenticador {
    boolean autenticar(String usuario, String credencial);
}


class AuthPassword implements Autenticador {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        return usuario.equals("admin") && credencial.equals("1234");
    }
}

class AuthBiometrico implements Autenticador {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        return credencial.equals("huella_valida");
    }
}


class SistemaAuth {

    private List<Autenticador> metodos = new ArrayList<>();

    public void agregarMetodo(Autenticador a) {
        metodos.add(a);
    }

    public boolean login(String user, String credencial) {
        for (Autenticador a : metodos) {
            if (a.autenticar(user, credencial)) {
                generarToken(user);
                return true;
            }
        }
        return false;
    }

    private void generarToken(String user) {
        System.out.println("Token generado para: " + user);
    }
}