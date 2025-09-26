package commands;
import devices.Thermostat;

public class DecreaseTemperatureCommand implements Command {
    private Thermostat thermostat;
    private int previousTemperature;
    
    public DecreaseTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    
    @Override
    public void execute() {
        previousTemperature = thermostat.getTemperature();
        thermostat.decreaseTemperature();
    }
    
    @Override
    public void undo() {
        thermostat.setTemperature(previousTemperature);
    }
}