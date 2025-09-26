package commands;
import devices.Device;

public class TurnOnCommand implements Command {
    private Device device;
    private boolean wasOn;
    
    public TurnOnCommand(Device device) {
        this.device = device;
    }
    
    @Override
    public void execute() {
        wasOn = device.isOn();
        device.turnOn();
    }
    
    @Override
    public void undo() {
        if (!wasOn) {
            device.turnOff();
        }
    }
}