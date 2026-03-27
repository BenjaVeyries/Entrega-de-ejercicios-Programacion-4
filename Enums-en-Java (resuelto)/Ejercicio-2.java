interface DescuentoStrategy {
    double aplicarDescuento(double total);
}


class DescuentoPorcentaje implements DescuentoStrategy {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double total) {
        return total - (total * porcentaje / 100);
    }
}

class DescuentoMontoMaximo implements DescuentoStrategy {
    private double max;

    public DescuentoMontoMaximo(double max) {
        this.max = max;
    }

    @Override
    public double aplicarDescuento(double total) {
        return total - Math.min(100, max);
    }
}

class DescuentoProgresivo implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(double total) {
        if (total > 1000) return total * 0.8;
        if (total > 500) return total * 0.9;
        return total;
    }
}


class Carrito {
    private double total;

    public Carrito(double total) {
        this.total = total;
    }

    public double aplicar(DescuentoStrategy estrategia) {
        if (total <= 0) throw new IllegalArgumentException("Total inválido");
        return estrategia.aplicarDescuento(total);
    }
}