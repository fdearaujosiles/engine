package engine.input;

import engine.game_object.GameObject;

public abstract class InputListener {

    protected final GameObject gameObject;

    protected InputListener(GameObject gameObject) {
        this.gameObject = gameObject;
    }
}
