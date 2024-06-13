package engine.game_object.ui;

import engine.game_object.GameObject;

import java.awt.*;

public class Text extends GameObject {

    private String string;

    public Text(Point position, String string) {
        super(position);
        setText(string);
    }
    public Text(int x, int y, String string) {
        super(x, y);
        setText(string);
    }

    @Override
    public void draw(Graphics g, int animIndex) {
        g.drawString(getText(), getX(), getY());
    }

    public String getText() {
        return string;
    }

    public void setText(String text) {
        this.string = text;
    }
}
