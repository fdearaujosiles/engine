package engine.game_object.ui;

import engine.game_object.GameObject;
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
