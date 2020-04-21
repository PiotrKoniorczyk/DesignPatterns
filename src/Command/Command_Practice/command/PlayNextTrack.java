package Command.Command_Practice.command;

import Command.Command_Practice.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand{

    MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
