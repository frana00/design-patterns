package commands;

import devices.Light;

public class LightOnCommand implements Command {
    private Light light;

    // El comando necesita saber sobre qué luz va a operar
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}