package devices;

public class Thermostat implements Device {
    private String name;
    private boolean isOn;
    private int temperature;
    
    public Thermostat(String name) {
        this.name = name;
        this.isOn = false;
        this.temperature = 22;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " thermostat turned on. Current temperature: " + temperature + "°C");
    }
    
    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " thermostat turned off");
    }
    
    @Override
    public boolean isOn() {
        return isOn;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (isOn) {
            System.out.println(name + " thermostat set to " + temperature + "°C");
        }
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public void increaseTemperature() {
        if (isOn) {
            temperature++;
            System.out.println(name + " temperature increased to " + temperature + "°C");
        }
    }
    
    public void decreaseTemperature() {
        if (isOn) {
            temperature--;
            System.out.println(name + " temperature decreased to " + temperature + "°C");
        }
    }
}