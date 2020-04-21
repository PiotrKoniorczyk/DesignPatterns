package Command.Command_Practice.command;

import Command.Command_Practice.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand {
    MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
