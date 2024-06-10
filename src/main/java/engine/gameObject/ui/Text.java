package engine.gameObject.ui;

import engine.gameObject.GameObject;

import java.awt.*;

public class Text extends GameObject {

    private String text;

    public Text(Point position, String text) {
        super(position);
        setText(text);
    }
    public Text(int x, int y, String text) {
        super(x, y);
        setText(text);
    }

    @Override
    public void draw(Graphics g, int animIndex) {
        g.drawString(getText(), getX(), getY());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
