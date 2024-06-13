package engine.game_object.ui.debug;

import engine.controller.MouseInputListener;
import engine.game_object.ui.Text;

import java.awt.*;
import java.awt.event.MouseEvent;

import static engine.utils.constants.Window.SHOW_POINTER;

public class Pointer extends Text {

    public Pointer()  {
        super(15, 32, "X: ? | Y: ?");
        setMouseInputs(
            new MouseInputListener(this) {
                @Override
                public void mouseMoved(MouseEvent e) {
                    setText("X: " + e.getX() + " | Y: " + e.getY());
                }
            }
        );
    }

    @Override
    public void draw(Graphics g, int aniIndex) {
        if(SHOW_POINTER) {
            super.draw(g, aniIndex);
        }
    }
}
