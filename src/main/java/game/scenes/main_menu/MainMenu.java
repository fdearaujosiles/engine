package game.scenes.main_menu;

import engine.game_object.GameObjectManager;
import engine.Scene;

public class MainMenu extends Scene {

    public MainMenu(GameObjectManager gOM) {
        super(gOM);
    }

    @Override
    public void start() {
        gOM.createObject(new BgImage());
        gOM.createObject(new ButtonPlay(gOM));
        gOM.createObject(new ButtonQuit());
    }

}
