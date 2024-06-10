package engine.window;

import engine.controller.InputManager;
import engine.gameObject.GameObjectManager;
import engine.gameObject.GameObject;
import engine.gameObject.Scene;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static engine.utils.constants.Window.*;

public class GamePanel extends JPanel {

    private final ArrayList<GameObject> objects = new ArrayList<>();
    private final InputManager iM = new InputManager(this);
    private final GameObjectManager gOM = new GameObjectManager(this);

    private int aniTick, aniIndex;

    public GamePanel() {
        setPanelSize();
    }

    public void setPanelSize() {
        Dimension size = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    private void updateAnimation() {
        aniTick++;
        if(aniTick >= ANIMATION_SPEED) {
            aniTick = 0;
            aniIndex++;
            if(aniIndex >= 120) {
                aniIndex = 0;
            }
        }
    }

    public void updateGame() {
        objects.forEach(GameObject::update);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        updateAnimation();
        try {
            for(GameObject gameObject : objects) {
                gameObject.draw(g, aniIndex);
            }
        } catch (Exception _) {}

    }

    public ArrayList<GameObject> getObjects() {
        return objects;
    }

    public InputManager getInputManager() {
        return iM;
    }

    public GameObjectManager getGameObjectManager() {
        return gOM;
    }
}
