package engine.game_object.ui.button;

import engine.input.MouseInputListener;
import engine.game_object.GameObject;

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
