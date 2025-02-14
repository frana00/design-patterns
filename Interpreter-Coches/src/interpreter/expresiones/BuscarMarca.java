package interpreter.expresiones;

import interpreter.modelo.Coche;

// Expresión terminal para buscar por marca
public class BuscarMarca implements ExpresionBusqueda {
    private String marca;

    public BuscarMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean interpretar(Coche coche) {
        return coche.getMarca().equalsIgnoreCase(marca);
    }
}