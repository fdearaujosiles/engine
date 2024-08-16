package engine;

import engine.game_object.GameObjectManager;
import engine.window.GamePanel;

import java.lang.reflect.InvocationTargetException;

import static engine.utils.constants.Window.*;

public class Game implements Runnable {


    private GamePanel gamePanel;

    public Game(Class<?> firstScene) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if(Scene.class.isAssignableFrom(firstScene)) {
            startGame();
            // FirstScene load
            firstScene.getDeclaredConstructor(GameObjectManager.class).newInstance(gamePanel.getGameObjectManager());
        } else {
            throw new InstantiationException("The constructor parameter should extend Scene class!");
        }
    }

    private void startGame() {
        Thread gameThread;
        gamePanel = new GamePanel();
        gamePanel.requestFocus();
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    @SuppressWarnings("InfiniteLoopStatement")
    public void run() {

        int frames = 0;
        gamePanel.setDeltaFrame(0);
        double timePerFrame = 1000000000.0 / FPS_SET;
        long lastFrameCheck = System.currentTimeMillis();

        int updates = 0;
        gamePanel.setDeltaUpdate(0);
        double timePerUpdate = 1000000000.0 / UPS_SET;
        long previousUpdate = System.nanoTime();

        while(true) {
            long now = System.nanoTime();
            gamePanel.addToDeltaUpdate((now - previousUpdate) / timePerUpdate);
            gamePanel.addToDeltaFrame((now - previousUpdate) / timePerFrame);
            previousUpdate = now;

            if(gamePanel.getDeltaUpdate() >= 1) {
                update();
                updates++;
                gamePanel.addToDeltaUpdate(-1);
            }
            if(gamePanel.getDeltaFrame() >= 1) {
                gamePanel.repaint();
                frames++;
                gamePanel.addToDeltaFrame(-1);
            }

            if(System.currentTimeMillis() - lastFrameCheck >= 1000) {
                lastFrameCheck = System.currentTimeMillis();
                gamePanel.getFpsCounter().update(frames, updates);
                frames = 0;
                updates = 0;
            }
        }
    }

    public void update() {
        gamePanel.updateGame();
    }
}
