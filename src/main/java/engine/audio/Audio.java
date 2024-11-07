package engine.audio;

import engine.audio.player.AudioPlayer;
import engine.audio.player.AudioWAV;
import engine.error.EngineRuntimeException;

public class Audio {

    AudioPlayer player;

    public Audio(String resource) {
        super();
        loadResource(resource, 0);
    }

    public Audio(String resource, int delay) {
        super();
        loadResource(resource, delay);
    }

    private void loadResource(String resource, int delay) {
        player = switch(resource.substring(resource.lastIndexOf(".")).toLowerCase()) {
            case ".wav" -> new AudioWAV(resource, delay);
            default -> throw new EngineRuntimeException();
        };
        player.start();
    }
}
