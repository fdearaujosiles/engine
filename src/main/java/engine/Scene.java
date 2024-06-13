package engine;

import engine.game_object.GameObjectManager;

public abstract class Scene {

    protected final GameObjectManager gOM;

    protected Scene(GameObjectManager gOM) {
        this.gOM = gOM;
        gOM.destroyAllObjects();
        start();
    }

    public abstract void start();
}
