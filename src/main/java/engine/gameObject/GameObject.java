package engine.gameObject;

import engine.sprite.Animation;
import engine.window.GamePanel;
import engine.controller.KeyboardInputListener;
import engine.controller.MouseInputListener;
import engine.sprite.Sprite;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import static engine.utils.constants.Window.SCALE;

public abstract class GameObject implements Drawable {
    private Point position = new Point(0, 0);
    private Dimension size = new Dimension(0, 0);
    private int rotation = 0;
    private Sprite sprite;
    private Animation animation;
    private MouseInputListener mouseInput;
    private KeyboardInputListener keyboardInput;

    public void update() {}

    public void draw(Graphics g, int animIndex) {
        BufferedImage frame = getAnimation().getFrame(animIndex);
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform old = g2d.getTransform();
        g2d.rotate(Math.toRadians(getRotation()), getWidth() / 2.0, getHeight() / 2.0);

        g.drawImage(frame, getX(), getY(), getWidth(), getHeight(), null);
        g2d.setTransform(old);
    }

    public void moveX(int v) {
        this.position.x += v;
    }

    public void moveY(int v) {
        this.position.y += v;
    }

    public void move(int x, int y) {
        this.position.x += x;
        this.position.y += y;
    }
    public void move(Point point) {
        this.position.x += point.x;
        this.position.y += point.y;
    }

    public GameObject(int x, int y) {
        setPosition(x, y);
    }

    public GameObject(Point point) {
        setPosition(point.x, point.y);
    }

    public GameObject(Point point, Dimension size) {
        setPosition(point.x, point.y);
        setSize(size.width, size.height);
    }

    public GameObject(int x, int y, int width, int height) {
        setPosition(x, y);
        setSize(width, height);
    }

    public GameObject() {}

    public int getX() {
        return position.x;
    }

    public void setX(int x) {
        this.position.x = x;
    }

    public int getY() {
        return position.y;
    }

    public void setY(int y) {
        this.position.y = y;
    }

    public void setPosition(int x, int y) {
        this.position.x = x;
        this.position.y = y;
    }

    public void setPosition(Point point) {
        this.position.x = point.x;
        this.position.y = point.y;
    }

    public Point getPosition() {
        return position;
    }

    public int getHeight() {
        return size.height;
    }

    public void setHeight(int height) {
        this.size.height = height;
    }

    public int getWidth() {
        return size.width;
    }

    public void setWidth(int width) {
        this.size.width = width;
    }

    public void setSize(int width, int height) {
        this.size.height = height;
        this.size.width = width;
    }

    public void setSize(Dimension size) {
        this.size.height = size.height;
        this.size.width = size.width;
    }

    public Dimension getSize() {
        return size;
    }

    public void setRotation(int degrees) {
        this.rotation = degrees;
    }

    public int getRotation() {
        return rotation;
    }

    public void setAnimation(String sprite) {
        setSprite(sprite);
        setAnimation(new Animation(getSprite()));
    }
    public void setAnimation(String sprite, int start,  int end) {
        setSprite(sprite);
        setAnimation(new Animation(getSprite(), start, end));
    }
    public void setAnimation(Sprite sprite) {
        setSprite(sprite);
        setAnimation(new Animation(getSprite()));
    }
    public void setAnimation(Sprite sprite, int start,  int end) {
        setSprite(sprite);
        setAnimation(new Animation(getSprite(), start, end));
    }
    public void setAnimation(int start,  int end) {
        setAnimation(new Animation(getSprite(), start, end));
    }
    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public Animation getAnimation() {
        return animation;
    }

    public MouseInputListener getMouseInputs() {
        return mouseInput;
    }

    public void setMouseInputs(MouseInputListener mouseInput) {
        this.mouseInput = mouseInput;
    }

    public KeyboardInputListener getKeyboardInputs() {
        return keyboardInput;
    }

    public void setKeyboardInputs(KeyboardInputListener keyboardInput) {
        this.keyboardInput = keyboardInput;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(String resource) {
        setSprite(new Sprite(resource));
    }

    public void setSprite(String resource, int tilesPerRow, int tilesPerCol) {
        setSprite(new Sprite(resource, tilesPerRow, tilesPerCol));
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
        setSize((int) (this.sprite.getTileWidth() * SCALE), (int) (this.sprite.getTileHeight() * SCALE));
    }
}