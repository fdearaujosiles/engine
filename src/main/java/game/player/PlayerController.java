package game.player;

import engine.controller.MouseInputListener;
import engine.gameObject.GameObject;

import java.awt.event.MouseEvent;

public class PlayerController extends MouseInputListener {

    public PlayerController(GameObject gameObject) {
        super(gameObject);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
    }
}
