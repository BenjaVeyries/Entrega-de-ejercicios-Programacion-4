package vehiculos;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;

    // Contador global (static)
    private static int contadorVehiculos = 0;

    // Constante (final)
    public static final int ANIO_MINIMO = 1900;

    public Vehiculo(String marca, String modelo, int anio) {
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
        contadorVehiculos++;
    }

    // Métodos abstractos
    public abstract double calcularConsumo();
    public abstract void mostrarInfo();

    // Método final (no se puede sobrescribir)
    public final void mostrarContador() {
        System.out.println("Total de vehículos creados: " + contadorVehiculos);
    }

    // Getters y Setters (encapsulamiento + validación)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Marca inválida");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio < ANIO_MINIMO) {
            throw new IllegalArgumentException("Año inválido");
        }
        this.anio = anio;
    }

    public static int getContadorVehiculos() {
        return contadorVehiculos;
    }
}