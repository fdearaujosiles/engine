package game.opponent;

import engine.game_object.GameObject;
import game.card.Deck;
import game.card.Pile;

import java.awt.*;

public class Opponent extends GameObject {

    private final OpponentHand hand;

    public Opponent(Deck deck, Pile pile) {
        this. hand = new OpponentHand(deck, pile);
        setMouseInputs(new OpponentController(this));
    }

    @Override
    public void draw(Graphics g, int animIndex) {
        getHand().positionCards(this);
        getHand().getCards().forEach(card -> card.draw(g, animIndex));
    }

    public OpponentHand getHand() {
        return hand;
    }
}
