package engine.audio.player;

public class AudioMP3 extends AudioPlayer {

    public AudioMP3(String resource, int delay) {
        super(resource, delay);
    }

    AudioMP3Player audioMP3Player;

    @Override
    protected void play(String filePath) {
        audioMP3Player = new AudioMP3Player(filePath);
        audioMP3Player.play();
    }

}
