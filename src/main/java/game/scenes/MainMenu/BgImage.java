package game.scenes.MainMenu;

import engine.gameObject.ui.Image;

import static engine.utils.constants.Sprites.BG_IMAGE;
import static engine.utils.constants.Window.SCREEN_HEIGHT;
import static engine.utils.constants.Window.SCREEN_WIDTH;

public class BgImage extends Image {

    public BgImage() {
        super(BG_IMAGE);

        setSize(SCREEN_WIDTH + 50, SCREEN_HEIGHT * (getWidth() / SCREEN_WIDTH) + 50);
        move(-25, -25);
    }
}
