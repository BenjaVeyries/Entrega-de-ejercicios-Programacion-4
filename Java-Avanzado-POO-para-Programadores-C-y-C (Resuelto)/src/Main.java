import automoviles.Auto;
import camiones.Camion;
import motos.Moto;
import vehiculos.TipoCombustible;
import vehiculos.Vehiculo;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("Toyota", "Corolla", 2020, 4, TipoCombustible.NAFTA);
        Camion camion = new Camion("Volvo", "FH", 2018, 18);
        Moto moto = new Moto("Yamaha", "R3", 2022, 321);

        auto.mostrarInfo();
        System.out.println("Consumo: " + auto.calcularConsumo());

        camion.mostrarInfo();
        System.out.println("Consumo: " + camion.calcularConsumo());

        moto.mostrarInfo();
        System.out.println("Consumo: " + moto.calcularConsumo());

        System.out.println("\nTotal vehículos: " + Vehiculo.getContadorVehiculos());
    }
}