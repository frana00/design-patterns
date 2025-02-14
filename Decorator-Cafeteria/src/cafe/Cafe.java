package cafe;

/**
 * Interfaz base para todos los cafés y decoradores.
 * Define el contrato que todos deben seguir.
 */
public interface Cafe {
    /**
     * Obtiene el costo total del café con sus extras
     * @return el precio total
     */
    double getCosto();

    /**
     * Obtiene la descripción completa del café con sus extras
     * @return la descripción del café
     */
    String getDescripcion();
}