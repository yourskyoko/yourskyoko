package commands;
import devices.MusicPlayer;

public class PlayMusicCommand implements Command {
    private MusicPlayer musicPlayer;
    private boolean wasPlaying;
    
    public PlayMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    
    @Override
    public void execute() {
        wasPlaying = musicPlayer.isPlaying();
        musicPlayer.playMusic();
    }
    
    @Override
    public void undo() {
        if (!wasPlaying) {
            musicPlayer.stopMusic();
        }
    }
}