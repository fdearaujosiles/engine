package engine.window;


import javax.swing.*;

public class GameWindow {

    public GameWindow(GamePanel gamePanel)  {
        JFrame jFrame = new JFrame("CardGame");

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setLocation(330,200);
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
