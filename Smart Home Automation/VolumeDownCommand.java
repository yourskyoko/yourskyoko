package commands;
import devices.MusicPlayer;

public class VolumeDownCommand implements Command {
    private MusicPlayer musicPlayer;
    private int previousVolume;
    
    public VolumeDownCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    
    @Override
    public void execute() {
        previousVolume = musicPlayer.getVolume();
        musicPlayer.volumeDown();
    }
    
    @Override
    public void undo() {
        musicPlayer.setVolume(previousVolume);
    }
}