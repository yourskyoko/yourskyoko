package demo;
import devices.*;
import commands.*;
import hub.SmartHomeHub;

public class SmartHomeDemo {
    public static void main(String[] args) {
        // Create smart home hub
        SmartHomeHub hub = new SmartHomeHub();
        
        // Create devices
        Light livingRoomLight = new Light("Living Room");
        Thermostat livingRoomThermostat = new Thermostat("Living Room");
        MusicPlayer livingRoomSpeaker = new MusicPlayer("Living Room");
        
        // Create commands for devices
        Command lightOn = new TurnOnCommand(livingRoomLight);
        Command lightOff = new TurnOffCommand(livingRoomLight);
        Command tempUp = new IncreaseTemperatureCommand(livingRoomThermostat);
        Command tempDown = new DecreaseTemperatureCommand(livingRoomThermostat);
        Command volumeUp = new VolumeUpCommand(livingRoomSpeaker);
        Command volumeDown = new VolumeDownCommand(livingRoomSpeaker);
        Command playMusic = new PlayMusicCommand(livingRoomSpeaker);
        
        System.out.println("=== Smart Home Automation Demo ===\n");
        
        // Test various commands
        System.out.println("1. Controlling Lights:");
        hub.executeCommand(lightOn);
        hub.executeCommand(lightOff);
        
        System.out.println("\n2. Controlling Thermostat:");
        hub.executeCommand(new TurnOnCommand(livingRoomThermostat));
        hub.executeCommand(tempUp);
        hub.executeCommand(tempUp);
        hub.executeCommand(tempDown);
        
        System.out.println("\n3. Controlling Music Player:");
        hub.executeCommand(new TurnOnCommand(livingRoomSpeaker));
        hub.executeCommand(volumeUp);
        hub.executeCommand(volumeUp);
        hub.executeCommand(playMusic);
        hub.executeCommand(volumeDown);
        
        System.out.println("\n4. Undo Operations:");
        hub.undoLastCommand(); // Undo volume down
        hub.undoLastCommand(); // Undo play music
        hub.undoLastCommand(); // Undo volume up
        
        System.out.println("\n5. Command History:");
        hub.showCommandHistory();
        
        // Demonstrate adding a new device without changing existing code
        System.out.println("\n6. Adding New Device (Security Camera):");
        SecurityCamera frontDoorCamera = new SecurityCamera("Front Door");
        Command cameraOn = new TurnOnCommand(frontDoorCamera);
        Command startRecording = new StartRecordingCommand(frontDoorCamera);
        
        hub.executeCommand(cameraOn);
        hub.executeCommand(startRecording);
    }
}