package engine.gameObject.ui;

import engine.controller.MouseInputListener;
import engine.gameObject.GameObject;

import java.awt.*;
import java.awt.event.MouseEvent;

public abstract class Button extends GameObject {

    public Button(Point point, Dimension size) {
        super(point, size);
        initialize();
    }
    public Button(int x, int y, int width, int height) {
        super(x, y, width, height);
        initialize();
    }

    private void initialize() {
        setMouseInputs(new ButtonController(this));
    }

    public abstract void clicked();
}
