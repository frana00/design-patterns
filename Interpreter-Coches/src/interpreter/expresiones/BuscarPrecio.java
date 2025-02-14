package interpreter.expresiones;

import interpreter.modelo.Coche;

// Expresión terminal para buscar por precio máximo
public class BuscarPrecio implements ExpresionBusqueda {
    private double precioMaximo;

    public BuscarPrecio(double precioMaximo) {
        this.precioMaximo = precioMaximo;
    }

    @Override
    public boolean interpretar(Coche coche) {
        return coche.getPrecio() <= precioMaximo;
    }
}