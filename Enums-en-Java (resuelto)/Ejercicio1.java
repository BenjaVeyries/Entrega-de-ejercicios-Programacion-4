import java.util.*;


interface Notificacion {
    void enviar(String mensaje, String prioridad);
}


class Email implements Notificacion {
    public void enviar(String mensaje, String prioridad) {
        System.out.println("Email [" + prioridad + "]: " + mensaje);
    }
}

class SMS implements Notificacion {
    public void enviar(String mensaje, String prioridad) {
        System.out.println("SMS [" + prioridad + "]: " + mensaje);
    }
}

class Push implements Notificacion {
    public void enviar(String mensaje, String prioridad) {
        System.out.println("Push [" + prioridad + "]: " + mensaje);
    }
}


class GestorNotificaciones {

    private List<Notificacion> canales = new ArrayList<>();

    public void agregarCanal(Notificacion n) {
        canales.add(n);
    }

    public void enviarATodos(String mensaje, String prioridad) {
        for (Notificacion n : canales) {
            n.enviar(mensaje, prioridad);
        }
    }
}


public class Ejercicio1 {
    public static void main(String[] args) {

        GestorNotificaciones gestor = new GestorNotificaciones();

        gestor.agregarCanal(new Email());
        gestor.agregarCanal(new SMS());
        gestor.agregarCanal(new Push());

        gestor.enviarATodos("Servidor caído", "ALTA");
    }
}