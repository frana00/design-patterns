package interpreter.modelo;

// Clase que representa un coche en el catálogo
public class Coche {
    private String marca;
    private String modelo;
    private double precio;

    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
}