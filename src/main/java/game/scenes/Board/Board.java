package game.scenes.Board;

import engine.gameObject.GameObjectManager;
import engine.gameObject.Scene;
import game.card.Deck;
import game.card.others.Joker01;
import game.opponent.Opponent;
import game.player.Player;
import game.scenes.MainMenu.BgImage;
import game.scenes.MainMenu.ButtonPlay;
import game.scenes.MainMenu.ButtonQuit;

import static engine.utils.constants.Window.SCREEN_HEIGHT;
import static engine.utils.constants.Window.SCREEN_WIDTH;

public class Board extends Scene {

    public Board(GameObjectManager gOM) {
        super(gOM);
    }

    @Override
    public void start() {
        Player player = new Player();
        player.setPosition((int)(SCREEN_WIDTH / 3.5), 500);
        Opponent opponent = new Opponent();
        opponent.setPosition((int)(SCREEN_WIDTH /3.5), 100);
        Deck deck = new Deck();
        deck.setPosition((SCREEN_WIDTH / 2) - (deck.getWidth() / 2), (SCREEN_HEIGHT / 2) - deck.getHeight());

        gOM.createObject(new BgImage());
        gOM.createObject(deck);
        gOM.createObject(player);
        gOM.createObject(opponent);
        for(int i=0; i<4; i++) {
            player.getHand().addCard(deck.drawCard());
            opponent.getHand().addCard(deck.drawCard());
        }
    }

}
