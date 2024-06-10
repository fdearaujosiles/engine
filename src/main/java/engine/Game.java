package engine;

import engine.gameObject.ui.FPSCounter;
import engine.window.GamePanel;
import engine.window.GameWindow;
import game.scenes.MainMenu.MainMenu;

import static engine.utils.constants.Window.*;

public class Game implements Runnable {

    private Thread gameThread;

    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private FPSCounter fpsCounter;

    public Game() {
        startGame();
        // FirstScene load
        new MainMenu(gamePanel.getGameObjectManager());
    }

    private void startGame() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        fpsCounter = new FPSCounter(gamePanel);
        gamePanel.requestFocus();
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        int frames = 0;
        double deltaF = 0;
        double timePerFrame = 1000000000.0 / FPS_SET;
        long lastFrameCheck = System.currentTimeMillis();

        int updates = 0;
        double deltaU = 0;
        double timePerUpdate = 1000000000.0 / UPS_SET;
        long previousUpdate = System.nanoTime();

        while(true) {
            long now = System.nanoTime();
            deltaU += (now - previousUpdate) / timePerUpdate;
            deltaF += (now - previousUpdate) / timePerFrame;
            previousUpdate = now;

            if(deltaU >= 1) {
                update();
                updates++;
                deltaU--;
            }
            if(deltaF >= 1) {
                fpsCounter.draw();
                gamePanel.repaint();
                frames++;
                deltaF--;
            }

            if(System.currentTimeMillis() - lastFrameCheck >= 1000) {
                lastFrameCheck = System.currentTimeMillis();
                fpsCounter.update(frames, updates);
                frames = 0;
                updates = 0;
            }
        }
    }

    public void update() {
        gamePanel.updateGame();
    }
}
