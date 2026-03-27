package camiones;

import vehiculos.Vehiculo;

public class Camion extends Vehiculo {

    private double capacidadCarga;

    public Camion(String marca, String modelo, int anio, double capacidadCarga) {
        super(marca, modelo, anio);
        setCapacidadCarga(capacidadCarga);
    }

    @Override
    public double calcularConsumo() {
        return 20.0; // consumo alto
    }

    @Override
    public void mostrarInfo() {
        System.out.println("CAMION: " + getMarca() + " " + getModelo() +
                " | Año: " + getAnio() +
                " | Carga: " + capacidadCarga + " toneladas");
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        if (capacidadCarga <= 0) {
            throw new IllegalArgumentException("Capacidad inválida");
        }
        this.capacidadCarga = capacidadCarga;
    }
}