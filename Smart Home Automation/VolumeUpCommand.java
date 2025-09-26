package commands;
import devices.MusicPlayer;

public class VolumeUpCommand implements Command {
    private MusicPlayer musicPlayer;
    private int previousVolume;
    
    public VolumeUpCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    
    @Override
    public void execute() {
        previousVolume = musicPlayer.getVolume();
        musicPlayer.volumeUp();
    }
    
    @Override
    public void undo() {
        musicPlayer.setVolume(previousVolume);
    }
}