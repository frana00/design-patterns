package models;

import interfaces.Observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        // Procesar la notificación recibida
        System.out.println(name + " ha recibido una notificación: " + message);
    }
}