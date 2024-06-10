package engine.gameObject.ui;

import engine.controller.MouseInputListener;
import engine.gameObject.GameObject;

import java.awt.event.MouseEvent;

public class ButtonController extends MouseInputListener {

    public ButtonController(GameObject gameObject) {
        super(gameObject);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(isIn(e)) {
            ((Button) gameObject).clicked();
        }
    }
}
