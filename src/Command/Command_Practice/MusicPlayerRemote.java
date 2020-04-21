package Command.Command_Practice;

import Command.Command_Practice.command.MusicPlayerCommand;

public class MusicPlayerRemote {

    public MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton(){
        musicPlayerCommand.play();

    }
}
