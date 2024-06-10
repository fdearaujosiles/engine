package game.player;

import engine.gameObject.GameObject;

import java.awt.*;

public class Player extends GameObject {

    public PlayerHand getHand() {
        return hand;
    }

    final PlayerHand hand = new PlayerHand();

    public Player() {

    }

    @Override
    public void draw(Graphics g, int animIndex) {
        getHand().positionCards(this);
        getHand().getCards().forEach(card -> card.draw(g, animIndex));
    }
}
