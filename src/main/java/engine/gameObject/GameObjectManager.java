package engine.gameObject;

import engine.window.GamePanel;

public class GameObjectManager {

    private final GamePanel gamePanel;

    public GameObjectManager(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void createObject(GameObject gameObject) {
        gamePanel.getObjects().add(gameObject);
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
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }
}
