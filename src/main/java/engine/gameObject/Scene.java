package engine.gameObject;

import engine.gameObject.ui.Text;

public abstract class Scene {

    protected final GameObjectManager gOM;

    public Scene(GameObjectManager gOM) {
        this.gOM = gOM;
        gOM.destroyAllObjects();
        start();
    }

    public abstract void start();
}
