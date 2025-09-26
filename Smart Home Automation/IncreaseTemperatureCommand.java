package commands;
import devices.Thermostat;

public class IncreaseTemperatureCommand implements Command {
    private Thermostat thermostat;
    private int previousTemperature;
    
    public IncreaseTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    
    @Override
    public void execute() {
        previousTemperature = thermostat.getTemperature();
        thermostat.increaseTemperature();
    }
    
    @Override
    public void undo() {
        thermostat.setTemperature(previousTemperature);
    }
}