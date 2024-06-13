package engine.game_object;

import engine.window.GamePanel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GameObjectManager {

    private final GamePanel gamePanel;
    private final ArrayList<GameObject> objects = new ArrayList<>();

    public GameObjectManager(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void createObject(GameObject gameObject) {
        objects.add(gameObject);
        gamePanel.getInputManager().addObjectInputs(gameObject);
    }

    public void destroyObject(GameObject gameObject) {
        gamePanel.getInputManager().removeObjectInputs(gameObject);
        gamePanel.getObjects().remove(gameObject);
    }

    public void destroyAllObjects() {
        for(GameObject gameObject : gamePanel.getObjects()) {
            gamePanel.getInputManager().removeObjectInputs(gameObject);
        }
        gamePanel.getObjects().removeAll(gamePanel.getObjects());

        createObject(gamePanel.getPointer());
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public void forEach(Consumer<GameObject> func) {
        objects.forEach(func);
    }

    public List<GameObject> getObjects() {
        return objects;
    }

    public boolean isEmpty() {
        return objects.isEmpty();
    }
}
