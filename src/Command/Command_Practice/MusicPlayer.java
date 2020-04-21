package Command.Command_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    int currentTrackNumber = 0;


    public void playFirstTrack(){
        System.out.println("Gram pierwszy utwór: " +tracks.get(0));
    }

    public void playNextTrack(){
        currentTrackNumber++;
        if(currentTrackNumber>2){
            currentTrackNumber = 0;
        }
        System.out.println("Gram kolejny utwór: " +tracks.get(currentTrackNumber));
    }

    public void playRandomTrack(){
        Random random = new Random();
        int randomSong = random.nextInt(3);;
        if(currentTrackNumber>2){
            currentTrackNumber = 0;
        }
        System.out.println("Gram losowy utwór: " +tracks.get(randomSong));
    }
}
