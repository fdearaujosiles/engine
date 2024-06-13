package engine.controller;

import engine.game_object.GameObject;
import engine.window.GamePanel;

import static java.util.Objects.isNull;

public class InputManager {

    private final GamePanel gamePanel;

    public InputManager(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void addObjectInputs(GameObject object) {
        if(!isNull(object.getKeyboardInputs())) {
            gamePanel.addKeyListener(object.getKeyboardInputs());
        }
        if(!isNull(object.getMouseInputs())) {
            gamePanel.addMouseListener(object.getMouseInputs());
            gamePanel.addMouseWheelListener(object.getMouseInputs());
            gamePanel.addMouseMotionListener(object.getMouseInputs());
        }
    }

    public void removeObjectInputs(GameObject object) {
        if(!isNull(object.getKeyboardInputs())) {
            gamePanel.removeKeyListener(object.getKeyboardInputs());
        }
        if(!isNull(object.getMouseInputs())) {
            gamePanel.removeMouseListener(object.getMouseInputs());
            gamePanel.removeMouseWheelListener(object.getMouseInputs());
            gamePanel.removeMouseMotionListener(object.getMouseInputs());
        }
    }
}
