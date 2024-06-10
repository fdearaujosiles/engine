package game.scenes.MainMenu;

import engine.gameObject.GameObjectManager;
import engine.gameObject.ui.Button;
import game.scenes.Board.Board;

import java.awt.*;

import static engine.utils.constants.Sprites.PLAY_BUTTON;
import static engine.utils.constants.Window.SCREEN_HEIGHT;
import static engine.utils.constants.Window.SCREEN_WIDTH;

public class ButtonPlay extends Button {

    private static final Point BUTTON_POSITION = new Point((int)(SCREEN_WIDTH / 2.5), SCREEN_HEIGHT / 4);
    private static final Dimension BUTTON_SIZE = new Dimension(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
    private final GameObjectManager gOM;

    public ButtonPlay(GameObjectManager gOM) {
        super(BUTTON_POSITION, BUTTON_SIZE);
        this.gOM = gOM;
        setAnimation(PLAY_BUTTON);
    }

    @Override
    public void clicked() {
        new Board(gOM);
    }
}
