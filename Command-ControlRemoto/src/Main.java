import commands.*;
import devices.*;
import remote.*;

public class Main {
    public static void main(String[] args) {
        // Crear el control remoto (invocador)
        RemoteControl remote = new RemoteControl();

        // Crear los dispositivos (receptores)
        Light livingRoomLight = new Light("Sala");
        Light kitchenLight = new Light("Cocina");

        // Crear los comandos
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // Configurar los comandos en el control remoto
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);

        // Usar el control remoto
        System.out.println("=== Probando el Control Remoto ===");
        remote.pressOnButton(0);  // Enciende la luz de la sala
        remote.pressOffButton(0); // Apaga la luz de la sala
        remote.pressOnButton(1);  // Enciende la luz de la cocina
        remote.pressOffButton(1); // Apaga la luz de la cocina
    }
}