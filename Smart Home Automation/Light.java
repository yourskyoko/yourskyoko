package devices;

public class Light implements Device {
    private String name;
    private boolean isOn;
    private int brightness;
    
    public Light(String name) {
        this.name = name;
        this.isOn = false;
        this.brightness = 50;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " light turned on with brightness " + brightness + "%");
    }
    
    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " light turned off");
    }
    
    @Override
    public boolean isOn() {
        return isOn;
    }
    
    public void setBrightness(int brightness) {
        this.brightness = brightness;
        if (isOn) {
            System.out.println(name + " light brightness set to " + brightness + "%");
        }
    }
    
    public int getBrightness() {
        return brightness;
    }
}