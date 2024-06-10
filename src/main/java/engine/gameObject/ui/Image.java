package engine.gameObject.ui;

import engine.gameObject.GameObject;
import engine.sprite.Sprite;

public class Image extends GameObject {

    public Image(String resource) {
        super();
        setAnimation(resource);
    }
    public Image(Sprite sprite) {
        super();
        setAnimation(sprite);
    }
    public Image(String resource, int start, int end) {
        super();
        setAnimation(resource, start, end);
    }
    public Image(Sprite sprite, int start, int end) {
        super();
        setAnimation(sprite, start, end);
    }
}
