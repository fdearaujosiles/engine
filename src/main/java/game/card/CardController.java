package game.card;

import engine.controller.MouseInputListener;
import engine.game_object.GameObject;

import java.awt.*;
import java.awt.event.MouseEvent;

public class CardController extends MouseInputListener {

    public CardController(GameObject gameObject) {
        super(gameObject);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Dimension cardSize = gameObject.getSize();
        gameObject.setPosition(e.getX() - (cardSize.width/2), e.getY() - (cardSize.height/2));
    }
}
