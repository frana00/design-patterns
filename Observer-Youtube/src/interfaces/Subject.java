package interfaces;

public interface Subject {
    // Métodos para gestionar suscriptores
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    // Método para notificar a los suscriptores
    void notifyObservers(String message);
}