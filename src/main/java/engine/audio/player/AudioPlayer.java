package engine.audio.player;

public abstract class AudioPlayer extends Thread {

    String resource;
    int delay = 0;

    public AudioPlayer(String resource, int delay) {
        this.resource = resource;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.play(resource);
    }

    protected abstract void play(String resource);
}
