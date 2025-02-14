package interpreter.expresiones;

import interpreter.modelo.Coche;

// Interfaz base para todas las expresiones de búsqueda
public interface ExpresionBusqueda {
    boolean interpretar(Coche coche);
}