package engine.gameObject.ui;

import engine.window.GamePanel;

import static engine.utils.constants.Window.SHOW_FPS_COUNTER;

public class FPSCounter {

    private GamePanel gamePanel;
    private final Text fpsCounter = new Text(15, 15, "");

    public FPSCounter(GamePanel gamePanel)  {
        this.gamePanel = gamePanel;
    }

    public void draw() {
        if(SHOW_FPS_COUNTER) {
            gamePanel.getGameObjectManager().createObject(fpsCounter);
        }
    }
    public void update(int frames, int updates) {
        if(SHOW_FPS_COUNTER) {
            fpsCounter.setText("FPS: " + frames + "  |  UPS: " + updates);
//            System.out.println("FPS: " + frames + "  |  UPS: " + updates);
        }
    }
}
