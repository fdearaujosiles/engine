package engine.game_object.ui.button;

import engine.game_object.GameObject;

import java.awt.*;

public abstract class Button extends GameObject {

    protected Button(Point point, Dimension size) {
        super(point, size);
        initialize();
    }
    protected Button(int x, int y, int width, int height) {
        super(x, y, width, height);
        initialize();
    }

    private void initialize() {
        setMouseInputs(new ButtonController(this));
    }

    public abstract void clicked();
}
