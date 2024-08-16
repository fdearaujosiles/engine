package engine.window;

import engine.input.InputManager;
import engine.game_object.GameObjectManager;
import engine.game_object.GameObject;
import engine.game_object.ui.debug.FPSCounter;
import engine.game_object.ui.debug.Pointer;

import javax.swing.*;
import java.awt.*;
import java.util.ConcurrentModificationException;
import java.util.List;

import static engine.utils.constants.Window.*;

public class GamePanel extends JPanel {

    private double deltaFrame;
    private double deltaUpdate;

    private final transient InputManager iM = new InputManager(this);
    private final transient GameObjectManager gOM = new GameObjectManager(this);
    private final transient FPSCounter fpsCounter = new FPSCounter();
    private final transient Pointer pointer = new Pointer();

    private int aniTick;
    private int aniIndex;

    public GamePanel() {
        setPanelSize();
        new GameWindow(this);
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
        gOM.forEach(GameObject::update);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            updateAnimation();
            if(!gOM.isEmpty()) {
                gOM.forEach(gameObject -> gameObject.draw(g, aniIndex));
            }
        } catch (ConcurrentModificationException _) {}

        fpsCounter.draw(g,aniIndex);
        pointer.draw(g,aniIndex);
    }

    public List<GameObject> getObjects() {
        return gOM.getObjects();
    }

    public InputManager getInputManager() {
        return iM;
    }

    public GameObjectManager getGameObjectManager() {
        return gOM;
    }

    public FPSCounter getFpsCounter() {
        return fpsCounter;
    }

    public Pointer getPointer() {
        return pointer;
    }

    public double getDeltaFrame() {
        return deltaFrame;
    }

    public void setDeltaFrame(double deltaFrame) {
        this.deltaFrame = deltaFrame;
    }

    public double getDeltaUpdate() {
        return deltaUpdate;
    }

    public void setDeltaUpdate(double deltaUpdate) {
        this.deltaUpdate = deltaUpdate;
    }

    public void addToDeltaFrame(int deltaFrame) {
        this.deltaFrame += deltaFrame;
    }
    public void addToDeltaFrame(double deltaFrame) {
        this.deltaFrame += deltaFrame;
    }

    public void addToDeltaUpdate(int deltaUpdate) {
        this.deltaUpdate += deltaUpdate;
    }
    public void addToDeltaUpdate(double deltaUpdate) {
        this.deltaUpdate += deltaUpdate;
    }
}
