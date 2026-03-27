package motos;

import vehiculos.Vehiculo;

public final class Moto extends Vehiculo { // final → no se puede heredar

    private int cilindrada;

    public Moto(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        setCilindrada(cilindrada);
    }

    @Override
    public double calcularConsumo() {
        return 4.0;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("MOTO: " + getMarca() + " " + getModelo() +
                " | Año: " + getAnio() +
                " | Cilindrada: " + cilindrada + "cc");
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada <= 0) {
            throw new IllegalArgumentException("Cilindrada inválida");
        }
        this.cilindrada = cilindrada;
    }
}