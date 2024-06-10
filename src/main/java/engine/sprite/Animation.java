package engine.sprite;

import java.awt.image.BufferedImage;

public class Animation {

    private BufferedImage[] frames;

    public Animation(Sprite sprite) {
        setFrames(sprite);
    }

    public Animation(Sprite sprite, int start, int end) {
        setFrames(sprite, start, end);
    }

    public void setFrames(Sprite sprite, int start, int end) {
        frames = sprite.getFrames(start, end);
    }

    public void setFrames(Sprite sprite) {
        frames = sprite.getAllFrames();
    }

    public BufferedImage getFrame(int frameIdx) {
        return frames[frameIdx % frames.length];
    }

}
