package engine.controller;

import engine.game_object.GameObject;

import java.awt.event.*;

public abstract class MouseInputListener extends InputListener implements MouseListener, MouseMotionListener, MouseWheelListener {

    protected MouseInputListener(GameObject gameObject) {
        super(gameObject);
    }

    protected static boolean isIn(MouseEvent e, GameObject gO) {
        int xEnd = gO.getX() + Math.abs(gO.getWidth());
        int yEnd = gO.getY() + Math.abs(gO.getHeight());
        boolean xIn = e.getX() >= gO.getX() && e.getX() <= xEnd;
        boolean yIn = e.getY() >= gO.getY() && e.getY() <= yEnd;

        return xIn && yIn;
    }

    protected boolean isIn(MouseEvent e) {
        return isIn(e, gameObject);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {}
}
