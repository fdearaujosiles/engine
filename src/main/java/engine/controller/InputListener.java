package engine.controller;

import engine.gameObject.GameObject;

public abstract class InputListener {

    protected GameObject gameObject;

    public InputListener(GameObject gameObject) {
        this.gameObject = gameObject;
    }

}
