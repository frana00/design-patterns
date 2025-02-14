package models;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private String channelName;
    // Lista de suscriptores
    private List<Observer> subscribers = new ArrayList<>();

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer observer) {
        // Añadir nuevo suscriptor a la lista
        subscribers.add(observer);
        System.out.println("Nuevo suscriptor añadido al canal " + channelName);
    }

    @Override
    public void unsubscribe(Observer observer) {
        // Eliminar suscriptor de la lista
        subscribers.remove(observer);
        System.out.println("Suscriptor eliminado del canal " + channelName);
    }

    @Override
    public void notifyObservers(String message) {
        // Notificar a todos los suscriptores
        for (Observer observer : subscribers) {
            observer.update(channelName + ": " + message);
        }
    }

    // Método para simular la subida de un nuevo video
    public void uploadVideo(String videoTitle) {
        String message = "¡Nuevo video subido! - " + videoTitle;
        notifyObservers(message);
    }
}