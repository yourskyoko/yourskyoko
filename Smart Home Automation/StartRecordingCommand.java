package commands;
import devices.SecurityCamera;

public class StartRecordingCommand implements Command {
    private SecurityCamera camera;
    private boolean wasRecording;
    
    public StartRecordingCommand(SecurityCamera camera) {
        this.camera = camera;
    }
    
    @Override
    public void execute() {
        wasRecording = camera.isRecording();
        camera.startRecording();
    }
    
    @Override
    public void undo() {
        if (!wasRecording) {
            camera.stopRecording();
        }
    }
}