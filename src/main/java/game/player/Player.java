package game.player;

import engine.game_object.GameObject;
import game.card.Deck;
import game.card.Pile;

import java.awt.*;

public class Player extends GameObject {

    private final PlayerHand hand;

    public Player(Deck deck, Pile pile) {
        super();
        this.hand = new PlayerHand(deck, pile);
        setMouseInputs(new PlayerController(this));
    }

    @Override
    public void draw(Graphics g, int animIndex) {
        getHand().positionCards(this);
        getHand().getCards().forEach(card -> card.draw(g, animIndex));
    }

    public PlayerHand getHand() {
        return hand;
    }
}
