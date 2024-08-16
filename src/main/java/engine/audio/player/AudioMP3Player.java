package engine.audio.player;

import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackListener;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class AudioMP3Player extends PlaybackListener {

    File resource;
    AdvancedPlayer advancedPlayer;

    public AudioMP3Player(String resource) {
        this.resource = new File(getClass().getResource(resource).getPath());
    }

    public void play(){
        if(resource == null) return;

        try{
            FileInputStream fileInputStream = new FileInputStream(resource);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            advancedPlayer = new AdvancedPlayer(bufferedInputStream);
            advancedPlayer.setPlayBackListener(this);
            startMusicThread();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void startMusicThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    advancedPlayer.play();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
