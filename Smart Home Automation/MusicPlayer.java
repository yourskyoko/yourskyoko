package devices;

public class MusicPlayer implements Device {
    private String name;
    private boolean isOn;
    private int volume;
    private boolean isPlaying;
    
    public MusicPlayer(String name) {
        this.name = name;
        this.isOn = false;
        this.volume = 30;
        this.isPlaying = false;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " music player turned on. Volume: " + volume + "%");
    }
    
    @Override
    public void turnOff() {
        this.isOn = false;
        this.isPlaying = false;
        System.out.println(name + " music player turned off");
    }
    
    @Override
    public boolean isOn() {
        return isOn;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
        if (isOn) {
            System.out.println(name + " volume set to " + volume + "%");
        }
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void volumeUp() {
        if (isOn && volume < 100) {
            volume += 10;
            System.out.println(name + " volume increased to " + volume + "%");
        }
    }
    
    public void volumeDown() {
        if (isOn && volume > 0) {
            volume -= 10;
            System.out.println(name + " volume decreased to " + volume + "%");
        }
    }
    
    public void playMusic() {
        if (isOn) {
            isPlaying = true;
            System.out.println(name + " is now playing music at volume " + volume + "%");
        }
    }
    
    public void stopMusic() {
        isPlaying = false;
        System.out.println(name + " stopped playing music");
    }
    
    public boolean isPlaying() {
        return isPlaying;
    }
}