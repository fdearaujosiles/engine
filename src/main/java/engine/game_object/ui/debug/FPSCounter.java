package engine.game_object.ui.debug;

import engine.game_object.ui.Text;

import java.awt.*;

import static engine.utils.constants.Window.SHOW_FPS_COUNTER;

public class FPSCounter extends Text {

    public FPSCounter()  {
        super(15, 15, "FPS: ?  |  UPS: ?" );
    }

    @Override
    public void draw(Graphics g, int aniIndex) {
        if(SHOW_FPS_COUNTER) {
            super.draw(g, aniIndex);
        }
    }

    public void update(int frames, int updates) {
        if(SHOW_FPS_COUNTER) {
            setText("FPS: " + frames + "  |  UPS: " + updates);
        }
    }
}
