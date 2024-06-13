package game.scenes.board;

import engine.game_object.GameObjectManager;
import engine.Scene;
import game.card.Deck;
import game.card.Pile;
import game.opponent.Opponent;
import game.player.Player;
import game.scenes.main_menu.BgImage;

import static engine.utils.constants.Window.SCREEN_HEIGHT;
import static engine.utils.constants.Window.SCREEN_WIDTH;

public class Board extends Scene {

    public Board(GameObjectManager gOM) {
        super(gOM);
    }

    @Override
    public void start() {
        Deck deck = new Deck();
        Pile pile = new Pile();
        Player player = new Player(deck, pile);
        Opponent opponent = new Opponent(deck, pile);
        player.setPosition(SCREEN_WIDTH / 2, 575);
        opponent.setPosition(SCREEN_WIDTH / 2, 145);
        deck.setPosition((SCREEN_WIDTH / 2) - deck.getWidth() - 7, (SCREEN_HEIGHT / 2) - (deck.getHeight()/2));
        pile.setPosition((SCREEN_WIDTH / 2) + 7, (SCREEN_HEIGHT / 2) - (pile.getHeight()/2));

        gOM.createObject(new BgImage());
        gOM.createObject(opponent);
        gOM.createObject(pile);
        gOM.createObject(deck);
        gOM.createObject(player);
        player.getHand().addCard(deck.drawCard());
        for(int i=0; i<4; i++) {
            player.getHand().addCard(deck.drawCard());
            opponent.getHand().addCard(deck.drawCard());
        }
    }

}
