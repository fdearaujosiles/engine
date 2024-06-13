package game.card;

import engine.game_object.GameObject;
import game.utils.constants.Sprites;

import java.util.ArrayList;

public class Pile extends GameObject {

    private final ArrayList<Card> cards = new ArrayList<>();

    public Pile() {
        setSprite(Sprites.DECKBACKS, 7, 4);
        setAnimation(0, 1);
    }

    public Card drawCard() {
        int pileSize = cards.size();
        if(pileSize == 0) return null;
        Card newCard = cards.removeFirst();
        if(pileSize == 1) setAnimation(getSprite(), 0, 1);
        else setAnimation(cards.getFirst().getAnimation());
        return newCard;
    }

    public void addCard(Card card) {
        cards.addFirst(card);
        card.setState(Card.State.ON_PILE);
        setAnimation(card.getAnimation());
    }
}

