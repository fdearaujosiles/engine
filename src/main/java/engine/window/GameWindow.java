package engine.window;


import javax.swing.*;

public class GameWindow {

    private JFrame jFrame;

    public GameWindow(GamePanel gamePanel)  {
        jFrame = new JFrame("CardGame");

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setLocation(330,200);
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
