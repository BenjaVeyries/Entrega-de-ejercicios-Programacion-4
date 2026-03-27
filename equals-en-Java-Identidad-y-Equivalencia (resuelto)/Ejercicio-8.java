import java.util.*;

class Reserva {
    int inicio;
    int fin;

    public Reserva(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
}

class Sala {
    private List<Reserva> reservas = new ArrayList<>();

    public boolean reservar(int inicio, int fin) {
        for (Reserva r : reservas) {
            if (!(fin <= r.inicio || inicio >= r.fin)) {
                return false;
            }
        }
        reservas.add(new Reserva(inicio, fin));
        return true;
    }
}