package engine.input;

import engine.game_object.GameObject;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class KeyboardInputListener extends InputListener implements KeyListener {

    protected KeyboardInputListener(GameObject gameObject) {
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
