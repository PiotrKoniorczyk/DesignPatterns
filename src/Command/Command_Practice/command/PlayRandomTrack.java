package Command.Command_Practice.command;

import Command.Command_Practice.MusicPlayer;

public class PlayRandomTrack implements MusicPlayerCommand{

    MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void play() {
        musicPlayer.playRandomTrack();
    }
}
