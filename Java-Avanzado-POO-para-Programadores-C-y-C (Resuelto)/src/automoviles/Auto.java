package automoviles;

import vehiculos.Vehiculo;
import vehiculos.TipoCombustible;

public class Auto extends Vehiculo {

    private int puertas;
    private TipoCombustible combustible;

    public Auto(String marca, String modelo, int anio, int puertas, TipoCombustible combustible) {
        super(marca, modelo, anio);
        setPuertas(puertas);
        this.combustible = combustible;
    }

    @Override
    public double calcularConsumo() {
        return 8.5; // consumo promedio
    }

    @Override
    public void mostrarInfo() {
        System.out.println("AUTO: " + getMarca() + " " + getModelo() +
                " | Año: " + getAnio() +
                " | Puertas: " + puertas +
                " | Combustible: " + combustible);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        if (puertas <= 0) {
            throw new IllegalArgumentException("Cantidad de puertas inválida");
        }
        this.puertas = puertas;
    }
}