package game.card;

import engine.audio.Audio;
import engine.game_object.GameObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static game.utils.constants.Audios.CARD_AUDIO;
import static java.util.Objects.isNull;

public class Hand {

    private final ArrayList<Card> cards = new ArrayList<>();
    private final Deck deck;
    private final Pile pile;

    public Hand(Deck deck, Pile pile) {
        this.deck = deck;
        this.pile = pile;
    }

    public void drawCard() {
        Card newCard = deck.drawCard();
        if(!isNull(newCard)) addCard(newCard);
    }

    public void drawFromPile() {
        Card newCard = pile.drawCard();
        if(!isNull(newCard)) addCard(newCard);
    }

    public void discardCard(Card card) {
        pile.addCard(card);
        removeCard(card);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void positionCards(GameObject gameObject) {
        boolean isEven = cards.size() % 2 == 1;
        if(isEven) positionEvenHandOfCards(gameObject);
        else positionOddHandOfCards(gameObject);
    }

    public int getWidth() {
        int handSize = cards.size();
        if (handSize == 0) return 0;
        if (handSize == 1) return Math.abs(cards.getFirst().getWidth());
        return Math.abs(cards.getFirst().getWidth()) * Math.ceilDiv(handSize, 2);
    }

    public int getHeight() {
        int handSize = cards.size();
        if (handSize == 0) return 0;
        if (handSize == 1) return Math.abs(cards.getFirst().getHeight());
        return Math.abs(cards.getFirst().getHeight()) * 2;
    }

    private void positionOddHandOfCards(GameObject gameObject) {
        for(int i=0; i < cards.size(); i++) {
            Card card = cards.get(i);
            Point newPos = new Point(
                (gameObject.getX() - (getWidth()/2)) + (Math.abs(card.getWidth()) * Math.floorDiv(i,2)),
                (gameObject.getY() - Math.abs(card.getHeight())) + (Math.abs(card.getHeight()) * (i%2))
            );
            card.setPosition(newPos);
        }
    }

    private void positionEvenHandOfCards(GameObject gameObject) {
        for(int i=0; i < cards.size(); i++) {
            Card card = cards.get(i);
            Point newPos = new Point(
                (gameObject.getX() - (getWidth()/2)) + ((Math.abs(card.getWidth()) / 2) * i),
                (gameObject.getY() - Math.abs(card.getHeight())) + (Math.abs(card.getHeight()) * (i%2))
            );
            card.setPosition(newPos);
        }
    }

    public Deck getDeck() {
        return deck;
    }

    public Pile getPile() {
        return pile;
    }
}
