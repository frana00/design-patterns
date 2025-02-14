package remote;

import commands.Command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    // El control remoto tiene slots para múltiples dispositivos
    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
    }

    // Configura los comandos para un slot específico
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // Métodos para presionar los botones
    public void pressOnButton(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
        }
    }

    public void pressOffButton(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
        }
    }
}