package game.opponent;

import engine.gameObject.GameObject;

import java.awt.*;

public class Opponent extends GameObject {

    public OpponentHand getHand() {
        return hand;
    }

    final OpponentHand hand = new OpponentHand();

    public Opponent() {

    }

    @Override
    public void draw(Graphics g, int animIndex) {
        getHand().positionCards(this);
        getHand().getCards().forEach(card -> card.draw(g, animIndex));
    }
}
