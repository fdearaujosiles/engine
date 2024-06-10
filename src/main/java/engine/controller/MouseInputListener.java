package engine.controller;

import engine.gameObject.GameObject;

import java.awt.event.*;

public abstract class MouseInputListener extends InputListener implements MouseListener, MouseMotionListener, MouseWheelListener {

    public MouseInputListener(GameObject gameObject) {
        super(gameObject);
    }

    protected static boolean isIn(MouseEvent e, GameObject gO) {
        int xEnd = gO.getX() + gO.getWidth();
        int yEnd = gO.getY() + gO.getHeight();
        boolean xIn = e.getX() > gO.getX() && e.getX() < xEnd;
        boolean yIn = e.getY() > gO.getY() && e.getY() < yEnd;

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
