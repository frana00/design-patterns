package interpreter;

import interpreter.expresiones.*;
import interpreter.modelo.Coche;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos coches de prueba
        List<Coche> catalogo = new ArrayList<>();
        catalogo.add(new Coche("Toyota", "Corolla", 25000));
        catalogo.add(new Coche("Honda", "Civic", 23000));
        catalogo.add(new Coche("Toyota", "RAV4", 35000));

        // Ejemplo con AND: Toyota AND precio <= 30000
        ExpresionBusqueda busquedaAnd = new And(
                new BuscarMarca("Toyota"),
                new BuscarPrecio(30000)
        );

        // Ejemplo con OR: Toyota OR precio <= 24000
        ExpresionBusqueda busquedaOr = new Or(
                new BuscarMarca("Toyota"),
                new BuscarPrecio(24000)
        );

        // Realizar búsqueda con AND
        System.out.println("\nCoches Toyota con precio <= 30000 (AND):");
        for (Coche coche : catalogo) {
            if (busquedaAnd.interpretar(coche)) {
                System.out.println("- " + coche.getMarca() + " " +
                        coche.getModelo() + " ($" +
                        coche.getPrecio() + ")");
            }
        }

        // Realizar búsqueda con OR
        System.out.println("\nCoches que son Toyota O tienen precio <= 24000 (OR):");
        for (Coche coche : catalogo) {
            if (busquedaOr.interpretar(coche)) {
                System.out.println("- " + coche.getMarca() + " " +
                        coche.getModelo() + " ($" +
                        coche.getPrecio() + ")");
            }
        }
    }
}