import java.util.*;
import java.util.stream.*;

class Lectura {
    String sensorId;
    double valor;

    public Lectura(String sensorId, double valor) {
        this.sensorId = sensorId;
        this.valor = valor;
    }
}

class SistemaSensores {

    public static Map<String, Double> promedioPorSensor(List<Lectura> lecturas) {
        return lecturas.stream()
                .collect(Collectors.groupingBy(
                        l -> l.sensorId,
                        Collectors.averagingDouble(l -> l.valor)
                ));
    }
}