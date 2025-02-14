package interfaces;

public interface Observer {
    // Método que será llamado cuando el sujeto tenga una actualización
    void update(String message);
}