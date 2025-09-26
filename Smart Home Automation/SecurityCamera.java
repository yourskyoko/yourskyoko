package devices;

public class SecurityCamera implements Device {
    private String name;
    private boolean isOn;
    private boolean isRecording;
    
    public SecurityCamera(String name) {
        this.name = name;
        this.isOn = false;
        this.isRecording = false;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " security camera activated");
    }
    
    @Override
    public void turnOff() {
        this.isOn = false;
        this.isRecording = false;
        System.out.println(name + " security camera deactivated");
    }
    
    @Override
    public boolean isOn() {
        return isOn;
    }
    
    public void startRecording() {
        if (isOn) {
            isRecording = true;
            System.out.println(name + " started recording");
        }
    }
    
    public void stopRecording() {
        isRecording = false;
        System.out.println(name + " stopped recording");
    }
    
    public boolean isRecording() {
        return isRecording;
    }
}