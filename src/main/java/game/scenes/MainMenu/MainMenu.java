package game.scenes.MainMenu;

import engine.gameObject.GameObjectManager;
import engine.gameObject.Scene;
import engine.gameObject.ui.Image;

import static engine.utils.constants.Sprites.BG_IMAGE;
import static engine.utils.constants.Window.SCREEN_HEIGHT;
import static engine.utils.constants.Window.SCREEN_WIDTH;

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
