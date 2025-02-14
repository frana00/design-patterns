package devices;

public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    // Acciones reales que puede realizar la luz
    public void turnOn() {
        System.out.println(location + " luz encendida");
    }

    public void turnOff() {
        System.out.println(location + " luz apagada");
    }
}