package engine.controller;

import engine.gameObject.GameObject;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class KeyboardInputListener extends InputListener implements KeyListener {

    public KeyboardInputListener(GameObject gameObject) {
        super(gameObject);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
