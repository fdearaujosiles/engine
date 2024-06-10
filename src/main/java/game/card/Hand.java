package game.card;

import engine.gameObject.GameObject;

import java.awt.*;
import java.util.ArrayList;

public class Hand {

    final ArrayList<Card> cards = new ArrayList<>();

    public Hand() {}

    public void addCard(Card card) {
        cards.add(card);
        card.setState(Card.State.FaceUp);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void positionCards(GameObject gameObject) {
        for(int i=0; i < getCards().size(); i++) {
            Card card = getCards().get(i);
            Point newPos = new Point(
                    gameObject.getX() + (card.getWidth() * i),
                    gameObject.getY()
            );
            card.setPosition(newPos);
        }
    }
}
