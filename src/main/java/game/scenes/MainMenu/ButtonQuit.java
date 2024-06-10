package game.scenes.MainMenu;

import engine.gameObject.ui.Button;

import java.awt.*;

import static engine.utils.constants.Sprites.PLAY_BUTTON;
import static engine.utils.constants.Sprites.QUIT_BUTTON;
import static engine.utils.constants.Window.SCREEN_HEIGHT;
import static engine.utils.constants.Window.SCREEN_WIDTH;

public class ButtonQuit extends Button {

    private static final Point BUTTON_POSITION = new Point((int)(SCREEN_WIDTH / 2.5), (SCREEN_HEIGHT / 4 ) * 2);
    private static final Dimension BUTTON_SIZE = new Dimension(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);

    public ButtonQuit() {
        super(BUTTON_POSITION, BUTTON_SIZE);
        setAnimation(QUIT_BUTTON);
    }

    @Override
    public void clicked() {
        System.exit(0);
    }
}
