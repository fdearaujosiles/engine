package engine;

import game.scenes.main_menu.MainMenu;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        new Game(MainMenu.class);
    }
}